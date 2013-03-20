package socket;

import java.net.ServerSocket;

public class WebServer {
	public static void main(String argv[]) throws Exception {

		ServerSocket serverSocket = new ServerSocket(8080);
		
		while (true) {
			new Thread(new HttpRequest(serverSocket.accept())).start();
		}
	}
}
