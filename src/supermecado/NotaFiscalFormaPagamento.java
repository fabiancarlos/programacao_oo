package supermecado;

public class NotaFiscalFormaPagamento {

	private float valor;
	private FormaPagamento formaPagamento;
	
	public NotaFiscalFormaPagamento(float valor, FormaPagamento formaPagamento) {
		super();
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public float getValor() {
		return valor;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public String toString() {
		return "R$ " + valor + " (" + formaPagamento + ")\n";
	}
}
