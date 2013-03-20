package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(5000);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				Socket connection = server.accept();
				ConnectionHandler handler = new ConnectionHandler(connection);
				new Thread(handler).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
