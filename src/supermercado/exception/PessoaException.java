package supermercado.exception;

public class PessoaException extends Exception {
	
	public static final String NOME_INVALIDO = "Nome deve possuir entre 6 e 60 caracteres";
	
	public PessoaException(String msg){
		super(msg);
	}

}
