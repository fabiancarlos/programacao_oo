package supermecado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

	private Cliente cliente;
	private Funcionario funcionario;
	private Date data;
	private List<ItemNotaFiscal> itens;
	private List<NotaFiscalFormaPagamento> formasPagamento;

	public NotaFiscal(Funcionario funcionario) {
		this.cliente = null;
		this.funcionario = funcionario;
		this.data = new Date();
		this.itens = new ArrayList<ItemNotaFiscal>();
		this.formasPagamento = new ArrayList<NotaFiscalFormaPagamento>();
	}	
	
	public NotaFiscal(Cliente cliente, Funcionario funcionario, Date data, List<ItemNotaFiscal> itens,	List<NotaFiscalFormaPagamento> formasPagamento) {
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.data = data;
		this.itens = itens;
		this.formasPagamento = formasPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Date getData() {
		return data;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public List<NotaFiscalFormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setItens(List<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	public void setFormasPagamento(List<NotaFiscalFormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}
	
	public float getValorTotal() {
		float valorTotal = 0;
		for (ItemNotaFiscal inf : itens) valorTotal+=inf.getValorTotal();
		return valorTotal;
	}
	
	public float getValorTotalPago() {
		float valorTotal = 0;
		for (NotaFiscalFormaPagamento nffp : formasPagamento) valorTotal+=nffp.getValor();
		return valorTotal;
	}
	
	public boolean isPago() { return getValorTotal() == getValorTotalPago(); }
	
	public String toString() {
		String sItens = "";
		for (ItemNotaFiscal inf:itens) sItens+=inf;
		String sFormas = "";
		for (NotaFiscalFormaPagamento fp:formasPagamento) sFormas+=fp;
				
		return "Data da Emiss‹o: " + data + "\n" +
				"Cliente: " + cliente.getNome() + "\n" +
				"Funcion‡rio: " + funcionario.getNome() + "\n" +
				"Itens da Nota:\n" + sItens +
				"Formas de Pagamento:\n " + sFormas; 
				 
	}
	
}
