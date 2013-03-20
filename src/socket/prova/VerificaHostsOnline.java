package socket.prova;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Timer;
import java.util.TimerTask;

public class VerificaHostsOnline extends TimerTask {

	@Override
	public void run() {
		DatagramSocket ds;
		try {
			ds = new DatagramSocket();
			String msg = "Serviço ativo?";
			DatagramPacket dp = new DatagramPacket(msg.getBytes(),
					msg.length(), InetAddress.getByName("255.255.255.255"),
					7777);
			ds.send(dp);
			
			byte[] resposta = new byte[65000];
			dp = new DatagramPacket(resposta, resposta.length);
			ds.receive(dp);
			System.out.println(new String(dp.getData()));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Timer t = new Timer();
		VerificaHostsOnline task = new VerificaHostsOnline();
		t.schedule(task, 1000*60*1);
	}
	
}
