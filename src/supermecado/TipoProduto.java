package supermecado;

public class TipoProduto {

	private String nome;

	public TipoProduto(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "tipo: " + nome + "\n";
	}
}
