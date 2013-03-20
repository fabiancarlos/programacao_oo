package jppreti.locadora.exception;

import java.text.MessageFormat;

public class TamanhoException extends Exception {
	
	public static final String MENSAGEM_TEXTO = "O campo {0} deve possuir entre {1} e {2} caracteres.";
	public static final String MENSAGEM_NUMERO = "O campo {0} só aceita valores entre {1} e {2}.";
	
	public TamanhoException(String mensagem, String campo, String min, String max){
		super(MessageFormat.format(mensagem, campo, min, max));
	}

}
