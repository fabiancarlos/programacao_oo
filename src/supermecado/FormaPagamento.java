package supermecado;

public class FormaPagamento {

	private String nome;
	private byte maximoParcelas;

	public FormaPagamento(String nome, byte maximoParcelas) {
		super();
		this.nome = nome;
		this.maximoParcelas = maximoParcelas;
	}

	public String getNome() {
		return nome;
	}

	public byte getMaximoParcelas() {
		return maximoParcelas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMaximoParcelas(byte maximoParcelas) {
		this.maximoParcelas = maximoParcelas;
	}
	
	public String toString() {
		return nome;
	}
	
}
