package supermecado;

public class Endereco {

	private String rua, bairro, cep, complemento, numero;
	private Cidade cidade;
	
	public Endereco() {
		super();
		this.rua = "";
		this.bairro = "";
		this.cep = "";
		this.complemento = "";
		this.numero = "";
		this.cidade = null;		
	}
	
	public Endereco(String rua, String bairro, String cep, String complemento,
			String numero, Cidade cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.numero = numero;
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
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
	public String getNumero() {
		return numero;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setRua(String rua) {
		this.rua = rua;
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
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "IDEndereco: " + super.toString() + "\n" +
			   "Rua: " + rua + ", " + numero + "\n" +
			   "Bairro: " + bairro + "\n" +
			   "Complemento: " + complemento + "\n" +
			   "CEP: " + cep + "\n" + 
			   "Cidade: " + cidade + "\n"; 
	}
	
	
	
}
