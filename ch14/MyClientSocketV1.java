package ch14;

import java.io.OutputStream;
import java.net.Socket;

public class MyClientSocketV1 {

	public MyClientSocketV1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1", Config.PORT);
			System.out.println("connection " + client.getInetAddress().toString() + " port=" + Config.PORT + " ok!");
			OutputStream out = client.getOutputStream();
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				String line = "I say " + i;
				System.out.println("From client:" + line);
				out.write(line.getBytes());
				out.flush();
			}
			out.write(Config.BYE.getBytes());
			out.close();
			client.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
