package supermecado;

import java.util.Date;

import supermercado.exception.PessoaException;

public class Funcionario extends PessoaFisica {
	
	private Date dataAdmissao;
	private float salario;
	private Funcionario supervisor;
	
	public Funcionario getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Funcionario supervisor) {
		this.supervisor = supervisor;
	}

	public Funcionario() {
		super();
		this.dataAdmissao = null;
		this.salario = 0;
	}
	
	public Funcionario(String nome, Date dataNascimento, String rg, String cpf, Date dataAdmissao, float salario) throws PessoaException {
		super(nome, dataNascimento, rg, cpf);
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public float getSalario() {
		return salario;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Data Admiss�o: " + dataAdmissao + "\n" +
								  "Sal�rio: " + salario + "\n";
	}

}
