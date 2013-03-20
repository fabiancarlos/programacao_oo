package jppreti.locadora;

import java.util.regex.Pattern;

import jppreti.locadora.exception.CampoObrigatorioException;
import jppreti.locadora.exception.MascaraException;
import jppreti.locadora.exception.TamanhoException;

public class Estado {

	private Long idEstado;
	private String sigla;
	private String descricao;
	
	public Estado() {
		super();
		this.idEstado = null;
		this.sigla = "";
		this.descricao = "";		
	}
	
	public Estado(Long idEstado, String sigla, String descricao) {
		super();
		this.idEstado = idEstado;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void valida() throws CampoObrigatorioException, TamanhoException, MascaraException{
		if(getSigla() == null || getSigla().length() == 0)
			throw new CampoObrigatorioException("Sigla");
		if(!Pattern.matches("[A-Z]{2}", getSigla()))
			throw new MascaraException("Sigla do Estado", "AA");
		
		if(getDescricao() == null || getDescricao().length() == 0)
			throw new CampoObrigatorioException("Nome do Estado");
		if(getDescricao().length() < 5 || getDescricao().length() > 60)
			throw new TamanhoException(TamanhoException.MENSAGEM_TEXTO, "Nome do Estado", "5", "60");
	}
	
}
