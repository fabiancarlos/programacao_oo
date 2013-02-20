package supermecado;

public class Estado {

	private String nome;
	private String sigla;
	private String regiao;
	
	public Estado(String nome, String sigla, String regiao) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.regiao = regiao;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	@Override
	public String toString() {
		return "IDEstado: " + super.toString() + "\n" +
			   "Estado: " + nome + " (" + sigla + ")" + "\n" +
			   "Regi‹o: " + regiao + "\n";
	}
	
}
