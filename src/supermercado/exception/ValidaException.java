package supermercado.exception;

public class ValidaException extends Exception{

	public static final String CAMPO_OBRIGATORIO = "Campo de preenchimento obrigatorio";
    
    public ValidaException (String msg) {
        super(msg);
    }

}
