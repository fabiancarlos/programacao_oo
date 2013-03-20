package jppreti.locadora.exception;

import java.text.MessageFormat;

public class CampoObrigatorioException extends Exception {
	
	public static final String CAMPO_OBRIGATORIO = "O campo {0} é de preenchimento obrigatório.";
	
	public CampoObrigatorioException(String campo){
		super(MessageFormat.format(CAMPO_OBRIGATORIO, campo));
	}

}
