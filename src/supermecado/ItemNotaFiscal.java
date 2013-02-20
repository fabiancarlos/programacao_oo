package supermecado;

public class ItemNotaFiscal {

	private float qtde;
	private float valorUnitario;
	private Produto produto;
		
	public ItemNotaFiscal(float qtde, float valorUnitario, Produto produto) {
		this.qtde = qtde;
		this.valorUnitario = valorUnitario;
		this.produto = produto;
	}
	
	public float getQtde() {
		return qtde;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setQtde(float qtde) {
		this.qtde = qtde;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public float getValorTotal() { return valorUnitario*qtde; }
	
	public String toString() {
		return produto.getNome() + " (" + qtde + ") - " + (valorUnitario * qtde) + "\n";
	}
}
