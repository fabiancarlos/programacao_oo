package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadcastClient {

	public static void main(String args[]) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(5555);
		byte[] receiveData = new byte[1024];

		while (true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData,
					receiveData.length);
			serverSocket.receive(receivePacket);

			String sentence = new String(receivePacket.getData());
			System.out.println(sentence);

		}
	}
}