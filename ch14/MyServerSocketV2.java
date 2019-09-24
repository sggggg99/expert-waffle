package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocketV2 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(Config.PORT);
			System.out.println("server listen on port:" + Config.PORT + " ok!");
			Socket socket = server.accept(); // 等待客户端连接
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = in.readLine();
			while (!Config.BYE.equals(line)) {
				System.out.println("From server received: " + line);
				line = in.readLine();
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
