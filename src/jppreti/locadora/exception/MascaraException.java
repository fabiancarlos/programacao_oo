package jppreti.locadora.exception;

import java.text.MessageFormat;

public class MascaraException extends Exception {
	
	public static final String MENSAGEM = "A Mascara do campo {0} deve ser do formato {1}.";
	
	public MascaraException(String campo, String formato){
		super(MessageFormat.format(MENSAGEM, campo, formato));
	}

}
