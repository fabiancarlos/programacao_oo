package jppreti.locadora;

public class Rotulo {

	private Long idRotulo;
	private String nome;
	private String descricao;
	private int tempoDevolucao;

	public Rotulo() {
		super();
		this.idRotulo = null;
		this.nome = "";
		this.descricao = "";
		this.tempoDevolucao = 0;
	}
	
	public Rotulo(Long idRotulo, String nome, String descricao,	int tempoDevolucao) {
		super();
		this.idRotulo = idRotulo;
		this.nome = nome;
		this.descricao = descricao;
		this.tempoDevolucao = tempoDevolucao;
	}

	public Long getIdRotulo() {
		return idRotulo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getTempoDevolucao() {
		return tempoDevolucao;
	}

	public void setIdRotulo(Long idRotulo) {
		this.idRotulo = idRotulo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTempoDevolucao(int tempoDevolucao) {
		this.tempoDevolucao = tempoDevolucao;
	}
}
