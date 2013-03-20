package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DescobrePortas {

	public static void main(String[] args) {
		InetAddress endereco = null;
		String hostname = null;
		try {
			endereco = InetAddress.getLocalHost();
			hostname = endereco.getHostName();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		//for (int port = 0; port < 65536; port++) {
		for (int port = 65; port < 85; port++) {
			try {
				Socket s = new Socket(endereco, port);
				System.out.println("A server is listening on port " + port
						+ " of " + hostname);
				s.close();
			} catch (IOException e) {
				// O host não está escutando nessa porta
			}
		}
	}

}
