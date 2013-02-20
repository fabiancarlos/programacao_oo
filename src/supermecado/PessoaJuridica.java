package supermecado;

import java.util.Date;

import supermercado.exception.PessoaException;

/**
 * Classe especializada de Pessoa
 * @author Jo�o Paulo D. Preti
 *
 */
public class PessoaJuridica extends Pessoa {

	//Atributos de PessoaJuridica
	private String cnpj;
	private String inscricaoEstadual;
	private String nomeFantasia;
	
	//Construtor Default
	public PessoaJuridica() {
		super();
		this.cnpj = "";
		this.inscricaoEstadual = "";
		this.nomeFantasia = "";
	}
	
	//Construtor com todos os atributos de PessoaJuridica
	public PessoaJuridica(String nome, Date dataNascimento, String cnpj, String inscricaoEstadual,
			String nomeFantasia) throws PessoaException {
		super(nome, dataNascimento);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.nomeFantasia = nomeFantasia;
	}

	//M�todo acessor de cnpj
	public String getCnpj() {
		return cnpj;
	}
	//M�todo acessor de inscricaoEstadual
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	//M�todo acessor de nomeFantasia
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	//M�todo modificador de cnpj
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	//M�todo modificador de instricaoEstadual
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	//M�todo modificador de nomeFantasia
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		PessoaJuridica other = (PessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}
	
	/**
	 *	Retorna os valores de todos os atributos de PessoaJuridica
	 */
	@Override
	public String toString() {
		return super.toString() +
			   "Nome Fantasia: " + nomeFantasia + "\n" + 
			   "CNPJ: " + cnpj + "\n" + 
			   "Inscri��o Estadual: " + inscricaoEstadual + "\n";
	}
	
}

