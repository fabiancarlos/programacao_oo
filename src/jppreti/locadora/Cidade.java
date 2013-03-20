package jppreti.locadora;

import jppreti.locadora.exception.CampoObrigatorioException;
import jppreti.locadora.exception.MascaraException;
import jppreti.locadora.exception.TamanhoException;

public class Cidade {

	public Long idCidade;
	public String nome;
	public Estado uf;

	public Cidade() {
		super();
		this.idCidade = null;
		this.nome = "";
		this.uf = null;
	}	
	
	public Cidade(Long idCidade, String nome, Estado uf) {
		super();
		this.idCidade = idCidade;
		this.nome = nome;
		this.uf = uf;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public String getNome() {
		return nome;
	}

	public Estado getUf() {
		return uf;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUf(Estado uf) {
		this.uf = uf;
	}
	
	public void valida() throws CampoObrigatorioException, TamanhoException, MascaraException{
		if(getNome() == null || getNome().length() == 0)
			throw new CampoObrigatorioException("Nome da Cidade");
		
		if(getNome().length() < 5 || getNome().length() > 60)
			throw new TamanhoException(TamanhoException.MENSAGEM_TEXTO, "Nome da Cidade", "5", "60");
		
		if(getUf() == null)
			throw new CampoObrigatorioException("Estado/UF");
	}
	
	
	
}
