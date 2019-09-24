package ch14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;

public class MyClientSocketV2 {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1", Config.PORT);
			System.out.println("connection " + client.getInetAddress().toString() + " port=" + Config.PORT + " ok!");
			PrintWriter out = new java.io.PrintWriter(client.getOutputStream());
			for (int i = 0; i < 10; i++) {
				Thread.sleep(3000);
				String line = "I say " + i;
				//System.out.println("From client:" + line);
				out.write(line + "\r\n");
				out.flush();
			}
			
			out.write(Config.BYE);
			out.close();
			client.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
