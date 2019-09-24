package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;

public class MyClientSocketV3 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please define name !");
			System.exit(-1);
		}
		String name = args[0];
		try {
			Socket client = new Socket("127.0.0.1", Config.PORT);
			System.out.println("connection " + client.getInetAddress().toString() + " port=" + Config.PORT + " ok!");
			PrintWriter out = new java.io.PrintWriter(client.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out.write(name + "\r\n");
			for (int i = 0; i < 10; i++) {
				Thread.sleep(2000);
				String line = "I say " + i;
				System.out.println(line);
				out.write(line + "\r\n");
				out.flush();
				line = in.readLine();
				System.out.println(line);
			}
			out.write(Config.BYE + "\r\n");
			out.close();
			in.close();
			client.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
