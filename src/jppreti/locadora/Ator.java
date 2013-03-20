package jppreti.locadora;

public class Ator {

	private Long idAtor;
	private String nome;
	
	public Ator(Long idAtor, String nome) {
		super();
		this.idAtor = idAtor;
		this.nome = nome;
	}

	public Long getIdAtor() {
		return idAtor;
	}

	public String getNome() {
		return nome;
	}

	public void setIdAtor(Long idAtor) {
		this.idAtor = idAtor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
