package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MulticastServer {

	public static void main(String[] args) {
		String msg = "Ol‡ Mundo!";
		String ipMulticast = "226.1.1.1";
		int porta = 5555;
		try {
			DatagramSocket server = new DatagramSocket();
			
			InetAddress ia = InetAddress.getByName(ipMulticast);
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),ia, porta);
			server.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
