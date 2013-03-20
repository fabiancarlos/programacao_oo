package socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.StringTokenizer;

public class HttpRequest implements Runnable {

	private Socket connection;

	public HttpRequest(Socket connection) {
		this.connection = connection;
	}

	@Override
	public void run() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			DataOutputStream writer = new DataOutputStream(
					connection.getOutputStream());
			String request = reader.readLine();
			StringTokenizer tokens = new StringTokenizer(request);

			if (tokens.nextToken().equals("GET")) {
				System.out.println("Recebida uma requisição GET");
				String arquivo = tokens.nextToken();
				arquivo = "/Users/jppreti/Downloads"+arquivo;
				
				File file = new File(arquivo);
				
				if (file.exists()) {
					System.out.println("Arquivo encontrado!");
					int tamanho = (int) file.length();
					FileInputStream fis = new FileInputStream(arquivo);
					byte[] bytesDoArquivo = new byte[tamanho];
					fis.read(bytesDoArquivo);
					writer.writeBytes("HTTP/1.1 200 OK\r\n");
					if (arquivo.endsWith(".gif"))
						writer.writeBytes("Content-Type: image/gif\r\n");
					writer.writeBytes("Content-Length: " + tamanho + "\r\n");
					writer.writeBytes("\r\n");
					writer.write(bytesDoArquivo, 0, tamanho);
				} else {
					System.out.println("Arquivo não encontrado!");
					writer.writeBytes("HTTP/1.1 404 File not Found\r\n");
				}
				connection.close();
			} else {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
