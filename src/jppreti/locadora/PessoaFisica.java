package jppreti.locadora;

import java.util.Date;
import java.util.regex.Pattern;

import jppreti.locadora.exception.CampoObrigatorioException;
import jppreti.locadora.exception.MascaraException;
import jppreti.locadora.exception.TamanhoException;

public class PessoaFisica {

	private Long idPessoaFisica;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String telefone;
	private SexoEnum sexo;
	private Endereco endereco;

	public PessoaFisica() {
		super();
		this.idPessoaFisica = null;
		this.nome = "";
		this.dataNascimento = null;
		this.cpf = "";
		this.telefone = "";
		this.sexo = null;
		this.endereco = null;
	}
	
	public PessoaFisica(Long idPessoaFisica, String nome, Date dataNascimento, String cpf, String telefone, SexoEnum sexo, Endereco endereco) {
		super();
		this.idPessoaFisica = idPessoaFisica;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.sexo = sexo;
		this.endereco = endereco;
	}

	public Long getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setIdPessoaFisica(Long idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void valida() throws CampoObrigatorioException, TamanhoException, MascaraException{
		if(getNome() == null || getNome().length() == 0)
			throw new CampoObrigatorioException("Nome");
		if(getNome().length() < 5 || getNome().length() > 60)
			throw new TamanhoException(TamanhoException.MENSAGEM_TEXTO, "Nome", "5", "60");
		
		if(getDataNascimento() == null)
			throw new CampoObrigatorioException("Data Nascimento");
		
		if(getCpf() == null || getCpf().length() == 0)
			throw new CampoObrigatorioException("CPF");
		if(!Pattern.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}", getCpf()))
			throw new MascaraException("CPF", "000.000.000-00");
		
		if(getTelefone() == null || getTelefone().length() == 0)
			throw new CampoObrigatorioException("Telefone");
		if(!Pattern.matches("[(][0-9]{2}[)][ ][0-9]{4}[-][0-9]{4}", getTelefone()))
			throw new MascaraException("CPF", "(00) 0000-0000");
		
		if(getSexo() == null)
			throw new CampoObrigatorioException("Sexo");
		
		getEndereco().valida();
	}
}
