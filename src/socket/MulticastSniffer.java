package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MulticastSniffer {

	public static void main(String[] args) {
		String ipMulticast = "226.1.1.1";
		InetAddress ia = null;
		byte[] buffer = new byte[65535];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		int porta = 5555;
		
		try {
			ia = InetAddress.getByName(ipMulticast);
			MulticastSocket ms = new MulticastSocket(porta);
			ms.joinGroup(ia);
			while (true) {
				ms.receive(dp);
				String s = new String(dp.getData(),0,dp.getLength());
				System.out.println(s);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
