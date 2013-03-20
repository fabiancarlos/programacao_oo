package jppreti.locadora;

public class TabelaPreco {

	private Rotulo rotulo;
	private MidiaEnum tipoMidia;
	private float preco;

	public TabelaPreco(Rotulo rotulo, MidiaEnum tipoMidia, float preco) {
		super();
		this.rotulo = rotulo;
		this.tipoMidia = tipoMidia;
		this.preco = preco;
	}

	public Rotulo getRotulo() {
		return rotulo;
	}

	public MidiaEnum getTipoMidia() {
		return tipoMidia;
	}

	public float getPreco() {
		return preco;
	}

	public void setRotulo(Rotulo rotulo) {
		this.rotulo = rotulo;
	}

	public void setTipoMidia(MidiaEnum tipoMidia) {
		this.tipoMidia = tipoMidia;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}	
	
}
