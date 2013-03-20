package jppreti.locadora;

import java.util.regex.Pattern;

import jppreti.locadora.exception.CampoObrigatorioException;
import jppreti.locadora.exception.MascaraException;
import jppreti.locadora.exception.TamanhoException;

public class Endereco {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String complemento;
	private Cidade cidade;

	public Endereco() {
		super();
		this.logradouro = "";
		this.numero = "";
		this.bairro = "";
		this.cep = "";
		this.complemento = "";
		this.cidade = null;
	}
	
	public Endereco(String logradouro, String numero, String bairro, String cep, String complemento, Cidade cidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public void valida() throws CampoObrigatorioException, TamanhoException, MascaraException{
		if(getLogradouro() == null || getLogradouro().length() == 0)
			throw new CampoObrigatorioException("Rua/Logradouro");
		if(getLogradouro().length() < 5 || getLogradouro().length() > 100)
			throw new TamanhoException(TamanhoException.MENSAGEM_TEXTO, "Rua/Logradouro", "5", "100");
		
		if(getBairro() == null || getBairro().length() == 0)
			throw new CampoObrigatorioException("Bairro");
		if(getBairro().length() < 5 || getBairro().length() > 60)
			throw new TamanhoException(TamanhoException.MENSAGEM_TEXTO, "Bairro", "5", "60");
		
		if(getCep() == null || getCep().length() == 0)
			throw new CampoObrigatorioException("CEP");
		if(!Pattern.matches("[0-9]{2}[.][0-9]{3}[-][0-9]{3}", getCep()))
			throw new MascaraException("CEP", "00.000-000");
		
		if(getCidade() == null)
			throw new CampoObrigatorioException("Cidade");
	}

}
