package ch14;

import java.io.IOException;
import java.net.Socket;

public class SocketScan {

	public SocketScan() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String address = "www.163.com";
		for (int port = 80; port < 10000; port++) {
			try {
				System.out.println(address + " scan on port:" + port);
				Socket socket = new Socket(address, port);
				socket.close();
				System.out.println(address + " listen on port:" + port);
			} catch (IOException e) {
				System.out.println(address + " port=" + port + " connect error:" + e);
			}
		}
	}

}
