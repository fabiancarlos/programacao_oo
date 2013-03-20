package jppreti.locadora.exception;

import java.text.MessageFormat;

public class CampoObrigatorioException extends Exception {
	
	public static final String CAMPO_OBRIGATORIO = "O campo {0} � de preenchimento obrigat�rio.";
	
	public CampoObrigatorioException(String campo){
		super(MessageFormat.format(CAMPO_OBRIGATORIO, campo));
	}

}
