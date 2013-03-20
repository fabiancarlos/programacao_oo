package socket.prova;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class QuantidadeHostsOnline {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(7777);
			while (true) {
				try {
					byte[] msg = new byte[65536];
					DatagramPacket dp = new DatagramPacket(msg, msg.length);
					ds.receive(dp);
					if (new String(msg).equalsIgnoreCase("Serviço ativo?")) {
						System.out.println(dp.getAddress() + "   "
								+ dp.getPort());
						dp = new DatagramPacket("Sim".getBytes(),
								"Sim".length(), dp.getAddress(), dp.getPort());
						ds.send(dp);
						System.out.println("Resposta Enviada");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
