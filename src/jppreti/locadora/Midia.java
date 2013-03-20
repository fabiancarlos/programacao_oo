package jppreti.locadora;

public class Midia {

	private Long idMidia;
	private int qtde;
	private String localizacao;
	private MidiaEnum tipo;
	private Obra obra;

	public Midia() {
		super();
		this.idMidia = null;
		this.qtde = 0;
		this.localizacao = "";
		this.tipo = null;
		this.obra = null;
	}
	
	public Midia(Long idMidia, int qtde, String localizacao, MidiaEnum tipo, Obra obra) {
		super();
		this.idMidia = idMidia;
		this.qtde = qtde;
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.obra = obra;
	}

	public Long getIdMidia() {
		return idMidia;
	}

	public int getQtde() {
		return qtde;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public MidiaEnum getTipo() {
		return tipo;
	}

	public Obra getObra() {
		return obra;
	}

	public void setIdMidia(Long idMidia) {
		this.idMidia = idMidia;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void setTipo(MidiaEnum tipo) {
		this.tipo = tipo;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
	
}
