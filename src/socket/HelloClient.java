package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {

	public static void main(String[] args) {
		String hostname="localhost";
		int port = 5000;
		
		Socket connection = null;
		try {
			connection = new Socket(hostname,port);
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
			writer.println(hostname);
			writer.flush();
			String reply = reader.readLine();
			System.out.println("Servidor respondeu: " + reply);
			connection.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
