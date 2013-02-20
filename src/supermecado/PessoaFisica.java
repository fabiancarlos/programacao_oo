package supermecado;

import java.util.Date;

/**
 * Classe especializada de Pessoa
 * @author Jo‹o Paulo D. Preti
 *
 */
public abstract class PessoaFisica extends Pessoa {
	
	//Atributos de PessoaFisica
	private String cpf;
	private String rg;
	
	//Construtor Default
	public PessoaFisica() {
		super();
		this.cpf = "";
		this.rg = "";
	}

	//Construtor com todos os atributos de Pessoa F’sica 
	public PessoaFisica(String nome, Date dataNascimento, String rg, String cpf) {
		super(nome, dataNascimento);
		this.cpf = cpf;
		this.rg = rg;
	}

	//MŽtodo acessor de CPF
	public String getCpf() {
		return cpf;
	}
	//MŽtodo acessor de RG
	public String getRg() {
		return rg;
	}
	//MŽtodo modificador de CPF
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//MŽtodo modificador de RG
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}	
	
	/**
	 * Retorna os valores de todos os atributos de PessoaFisica
	 */
	@Override
	public String toString() {
		return super.toString() +
			   "RG: " + rg + "\n" +
			   "CPF: " + cpf + "\n";
	}

}
