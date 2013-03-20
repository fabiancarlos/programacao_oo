package jppreti.locadora;

import java.util.Date;

public class Funcionario extends PessoaFisica {

	private float salario;

	public Funcionario() {
		super();
		this.salario = 0;
	}
	
	public Funcionario(Long idPessoaFisica, String nome, Date dataNascimento, String cpf, String telefone, SexoEnum sexo, Endereco endereco, float salario) {
		super(idPessoaFisica, nome, dataNascimento, cpf, telefone, sexo, endereco);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}	
}
