package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocketV1 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(Config.PORT);
			System.out.println("server listen on port:" + Config.PORT + " ok!");
			Socket socket = server.accept(); // 等待客户端连接
			InputStream in = socket.getInputStream();
			byte[] data = new byte[Config.MAX_LEN];
			int readed = in.read(data);
			String line = new String(data, 0, readed);
			while (!Config.BYE.equals(line)) {
				System.out.println("From server received: " + line);
				readed = in.read(data);
				line = new String(data, 0, readed);
			}
			in.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
