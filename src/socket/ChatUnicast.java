package socket;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ChatUnicast extends JFrame {

	JLabel lblHost, lblPorta, lblMensagens, lblMensagem, lblNome;
	JFormattedTextField txtHost,txtPorta;
	JTextField txtMensagem, txtNome;
	JButton btnEnviar, btnIniciar;
	JRadioButton rdbCliente,rdbServidor;
	ButtonGroup btgTipo;
	JTextArea txaMensagens;
	JScrollPane scpMensagens;
	JPanel pnlNorte, pnlSul;
	
	private ServerSocket serverSocket;
	private Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	
	
	public ChatUnicast() {
		lblHost = new JLabel("Host:");
		lblPorta = new JLabel("Porta:");
		lblMensagens = new JLabel("Mensagens:");
		lblMensagem = new JLabel("Mensagem:");
		lblNome = new JLabel("Nome:");
		txtHost = new JFormattedTextField(createFormatter("###.###.###.###"));
		txtHost.setColumns(10);
		txtPorta = new JFormattedTextField(createFormatter("####"));
		txtPorta.setColumns(5);
		txtMensagem = new JTextField(50);
		txtNome = new JTextField(15);
		txaMensagens = new JTextArea(100,10);
		scpMensagens = new JScrollPane(txaMensagens);
		btnEnviar = new JButton("Enviar");
		btnIniciar = new JButton("Iniciar");
		rdbCliente = new JRadioButton("Cliente");
		rdbServidor = new JRadioButton("Servidor");
		btgTipo = new ButtonGroup();
		btgTipo.add(rdbCliente);
		btgTipo.add(rdbServidor);
		
		btnIniciar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				btnIniciar_actionPerformed(e);
			}
		});
		
		btnEnviar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				btnEnviar_actionPerformed(e);
			}
		});
		
		txtMensagem.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				txtMensagem_keyPressed(e);
			}
			
		});
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosed(WindowEvent e) {
				this_windowClosed(e);
			}
		});
				
		pnlNorte = new JPanel(new FlowLayout());
		pnlNorte.add(lblNome);
		pnlNorte.add(txtNome);
		pnlNorte.add(lblHost);
		pnlNorte.add(txtHost);
		pnlNorte.add(lblPorta);
		pnlNorte.add(txtPorta);
		pnlNorte.add(rdbCliente);
		pnlNorte.add(rdbServidor);
		pnlNorte.add(btnIniciar);
		
		pnlSul = new JPanel(new FlowLayout());
		pnlSul.add(txtMensagem);
		pnlSul.add(btnEnviar);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(pnlNorte, BorderLayout.NORTH);
		this.getContentPane().add(scpMensagens, BorderLayout.CENTER);
		this.getContentPane().add(pnlSul, BorderLayout.SOUTH);
		
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected void this_windowClosed(WindowEvent e) {
		try {
			socket.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	protected void txtMensagem_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == e.VK_ENTER) {
			btnEnviar.doClick();
		}
	}

	protected void btnEnviar_actionPerformed(ActionEvent e) {
		writer.println(txtNome.getText() + ": " + txtMensagem.getText());
		txaMensagens.append(txtNome.getText() + ": " + txtMensagem.getText()+"\n");
		writer.flush();
		txtMensagem.setText("");
	}

	protected void btnIniciar_actionPerformed(ActionEvent e) {
		if (rdbServidor.isSelected()) {
			try {
				serverSocket = new ServerSocket(Integer.parseInt(txtPorta.getText()));
				this.setTitle("SERVIDOR: AGUARDANDO CONEXÌO");
				socket = serverSocket.accept();
				this.setTitle("SERVIDOR: CONEXÌO ESTABELECIDA COM " + socket.getRemoteSocketAddress());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (rdbCliente.isSelected()) {
			try {
				this.setTitle("CLIENTE: TENTANDO OBTER CONEXÌO COM " + txtHost.getText()+":"+txtPorta.getText());
				socket = new Socket(txtHost.getText(),Integer.parseInt(txtPorta.getText()));
				this.setTitle("CLIENTE: CONEXÌO ESTABELECIDA COM " + socket.getRemoteSocketAddress());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		new Thread() {
			@Override
			public void run() {
				while(true) {
					try {
						String msg = reader.readLine();
						txaMensagens.append(msg+"\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();		
	}

	private MaskFormatter createFormatter(String formato) {
		MaskFormatter formatter = null;
	    try {
	        formatter = new MaskFormatter(formato);
	    } catch (java.text.ParseException exc) {
	        System.err.println("Formato Inv‡lido: " + exc.getMessage());
	        System.exit(-1);
	    }
	    return formatter;		
	}
	
	public static void main(String[] args) {
		new ChatUnicast();
	}
}
