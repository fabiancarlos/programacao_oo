package supermecado;

public class PessoaJuridicaProduto {

	private PessoaJuridica fornecedor;
	private Produto produto;
	
	public PessoaJuridicaProduto(PessoaJuridica fornecedor, Produto produto) {
		super();
		this.fornecedor = fornecedor;
		this.produto = produto;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String toString() {
		return fornecedor + " - " + produto;
	}
}
