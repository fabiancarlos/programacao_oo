package jppreti.locadora;

import java.util.HashSet;
import java.util.Set;

public class Obra {

	private Long idObra;
	private String tituloOriginal;
	private String tituloTraduzido;
	private String descricao;
	private String diretor;
	private Rotulo rotulo;
	private byte classificacao;
	private CategoriaFilmeEnum categoria;
	private Set<Ator> atores;

	public Obra() {
		super();
		this.idObra = null;
		this.tituloOriginal = "";
		this.tituloTraduzido = "";
		this.descricao = "";
		this.diretor = "";
		this.rotulo = null;
		this.classificacao = 0;
		this.categoria = null;
		this.atores = new HashSet<Ator>();
	}
	
	public Obra(Long idObra, String tituloOriginal, String tituloTraduzido, String descricao, String diretor, Rotulo rotulo, byte classificacao, CategoriaFilmeEnum categoria, Set<Ator> atores) {
		super();
		this.idObra = idObra;
		this.tituloOriginal = tituloOriginal;
		this.tituloTraduzido = tituloTraduzido;
		this.descricao = descricao;
		this.diretor = diretor;
		this.rotulo = rotulo;
		this.classificacao = classificacao;
		this.categoria = categoria;
		this.atores = atores;
	}

	public Long getIdObra() {
		return idObra;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public String getTituloTraduzido() {
		return tituloTraduzido;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDiretor() {
		return diretor;
	}

	public Rotulo getRotulo() {
		return rotulo;
	}

	public CategoriaFilmeEnum getCategoria() {
		return categoria;
	}

	public Set<Ator> getAtores() {
		return atores;
	}

	public void setIdObra(Long idObra) {
		this.idObra = idObra;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public void setTituloTraduzido(String tituloTraduzido) {
		this.tituloTraduzido = tituloTraduzido;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public void setRotulo(Rotulo rotulo) {
		this.rotulo = rotulo;
	}

	public byte getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(byte classificacao) {
		this.classificacao = classificacao;
	}

	public void setCategoria(CategoriaFilmeEnum categoria) {
		this.categoria = categoria;
	}

	public void setAtores(Set<Ator> atores) {
		this.atores = atores;
	}
}
