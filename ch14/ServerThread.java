/**
 * 
 */
package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author cjy
 * 
 */
public class ServerThread extends Thread {
	private Socket socket;

	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new java.io.PrintWriter(socket.getOutputStream());
			String line = in.readLine();
			String name = line;
			while (!Config.BYE.equals(line)) {
				System.out.println(name + " say:" + line);
				line = in.readLine();
				out.write("Echo from server," + name + " : " + line + "\r\n");
				out.flush();
			}
			in.close();
			out.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
