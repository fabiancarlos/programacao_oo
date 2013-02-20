package supermecado;

import java.util.Date;

/**
 * Classe que representa um conceito gen�rico/abstrato dos tipos de pessoas que existem no sistema.
 * @author Jo�o Paulo D. Preti
 *
 */
public abstract class Pessoa {

	//Atributos de Pessoa
	private String nome;
	private Date dataNascimento;
	private Endereco endereco;

	//Construtor Default
	public Pessoa() {
		this.nome = "";
		this.dataNascimento = new Date();
		this.endereco = new Endereco();
	}
	
	//Construtor que j� inicializa o objeto com todos os dados de pessoa
	public Pessoa(String nome, Date dataNascimento) {
		setNome(nome);
		this.dataNascimento = dataNascimento;
		this.endereco = new Endereco();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	//M�todo acessor da data de nascimento
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	//M�todo acessor do nome
	public String getNome() {
		return nome.toUpperCase();
	}

	//M�todo modificador da data de nascimento
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	//m�todo modificador do nome
	public void setNome(String nome) {
		if (nome.length()>5 && nome.length() < 60)
			this.nome = nome;
	}
	
	/**
	 * Retorna os valores de todos os atributos da classe Pessoa
	 */
	@Override
	public String toString() {
		return  "ID: " + super.toString() + "\n" + 
				"Nome: " + nome + "\n" +
				"Data de Nascimento: " + dataNascimento + "\n" +
				endereco;
	}
	@Override
	public void finalize() {
		System.out.println("Objeto de nome: " + nome + " foi removido da mem�ria!");
	}

}
