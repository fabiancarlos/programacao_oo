package supermecado;

public class UnidadeMedida {

	private String nome;
	private String sigla;
	private String descricao;
	
	public UnidadeMedida() {
		this.nome = "";
		this.sigla = "";
		this.descricao = "";		
	}
	
	public UnidadeMedida(String nome, String sigla, String descricao) {
		this.nome = nome;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return sigla;
	}
	
}
