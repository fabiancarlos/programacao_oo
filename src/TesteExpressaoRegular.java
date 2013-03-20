import java.util.regex.Pattern;


public class TesteExpressaoRegular {

	/*
	 * . qualquer caracter
	 * * 0 ou mais caracteres
	 * + 1 ou mais caracteres
	 * ? 0 ou 1 caracter
	 * [] conjunto de caracteres. ex.: [abcd]
	 * - intervalo de caracteres. ex.: [0-9] [a-z] [a-zA-Z]
	 * {} quantidade espec�fica de caracteres
	 * ^ nega��o
	 * \ caracteres pr�-definidos
	 *     \d qualquer d�gito
	 *     \D qualquer coisa que n�o seja um d�gito
	 *     
	 */
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}", "123.456.789-00"));
	}
	
}
