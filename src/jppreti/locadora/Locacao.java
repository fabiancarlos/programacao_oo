package jppreti.locadora;

import java.util.Date;

public class Locacao {

	private Long idLocacao;
	private Funcionario funcionario;
	private PessoaFisica locatario;
	private Date dataLocacao;
	private Date dataDevolucao;
	private Date dataDevolvida;
	private Date dataPagamento;
	private float valorLocacao;
	private float multa;
	private FormaPagamentoEnum formaPagamento;

	public Locacao() {
		super();
		this.idLocacao = null;
		this.funcionario = null;
		this.locatario = null;
		this.dataLocacao = new Date();
		this.dataDevolucao = null;
		this.dataDevolvida = null;
		this.dataPagamento = null;
		this.valorLocacao = 0;
		this.multa = 0;
		this.formaPagamento = null;
	}

	public Locacao(Long idLocacao, Funcionario funcionario, PessoaFisica locatario, Date dataLocacao, Date dataDevolucao, Date dataDevolvida, Date dataPagamento, float valorLocacao, float multa, FormaPagamentoEnum formaPagamento) {
		super();
		this.idLocacao = idLocacao;
		this.funcionario = funcionario;
		this.locatario = locatario;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.dataDevolvida = dataDevolvida;
		this.dataPagamento = dataPagamento;
		this.valorLocacao = valorLocacao;
		this.multa = multa;
		this.formaPagamento = formaPagamento;
	}

	public Long getIdLocacao() {
		return idLocacao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public PessoaFisica getLocatario() {
		return locatario;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public Date getDataDevolvida() {
		return dataDevolvida;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public float getValorLocacao() {
		return valorLocacao;
	}

	public float getMulta() {
		return multa;
	}

	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	public void setIdLocacao(Long idLocacao) {
		this.idLocacao = idLocacao;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setLocatario(PessoaFisica locatario) {
		this.locatario = locatario;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void setDataDevolvida(Date dataDevolvida) {
		this.dataDevolvida = dataDevolvida;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void setValorLocacao(float valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}

	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
