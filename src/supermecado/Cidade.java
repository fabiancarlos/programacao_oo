package supermecado;

public class Cidade {

	private String nome;
	private String ddd;
	private Estado estado;
	
	public Cidade(String nome, String ddd, Estado estado) {
		super();
		this.nome = nome;
		this.ddd = ddd;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDdd() {
		return ddd;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "IDCidade: " + super.toString() + "\n" +
			   "Cidade: " + nome + " (" + estado.getSigla() + ")" + "\n" +
			   "DDD: " + ddd + "\n";
	}
	
}
