package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocketV3 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(Config.PORT);
			System.out.println("server listen on port:" + Config.PORT + " ok!");
			while (true) {
				Socket socket = server.accept(); // 等待客户端连接
				System.out.println("client " + socket.getInetAddress() + " connect ok!");
				new ServerThread(socket).start();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
