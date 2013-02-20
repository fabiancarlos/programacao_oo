package supermecado;

import java.util.Date;

import javax.swing.JOptionPane;

import supermercado.exception.PessoaException;

public class Cliente extends PessoaFisica {
	
	private int numeroFidelidade;
	private int pontosFidelidade;
	
	public Cliente() {
		super();
		this.numeroFidelidade = 0;
		this.pontosFidelidade = 0;
	}
	
	public Cliente(String nome, Date dataNascimento, String rg, String cpf, int numeroFidelidade, int pontosFidelidade) throws PessoaException {
		super(nome, dataNascimento,rg,cpf);
		this.numeroFidelidade = numeroFidelidade;
		this.pontosFidelidade = pontosFidelidade;
	}
	
	public int getNumeroFidelidade() {
		return numeroFidelidade;
	}
	public int getPontosFidelidade() {
		return pontosFidelidade;
	}
	public void setNumeroFidelidade(int numeroFidelidade) {
		this.numeroFidelidade = numeroFidelidade;
	}
	public void setPontosFidelidade(int pontosFidelidade) {
		this.pontosFidelidade = pontosFidelidade;
	}

	@Override
	public String toString() {
		return super.toString() + "N�m, Fidelidade: " + numeroFidelidade + "\n" +
							      "Pontos: " + pontosFidelidade + "\n";
	}
	
}
