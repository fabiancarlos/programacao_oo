package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectionHandler implements Runnable {
	
	private Socket connection;
	
	public ConnectionHandler(Socket connection) {
		this.connection = connection;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
			String nomeCliente = reader.readLine();
			writer.println("Ol‡ " + nomeCliente);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
