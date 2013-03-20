import java.util.regex.Pattern;


public class TesteExpressaoRegular {

	/*
	 * . qualquer caracter
	 * * 0 ou mais caracteres
	 * + 1 ou mais caracteres
	 * ? 0 ou 1 caracter
	 * [] conjunto de caracteres. ex.: [abcd]
	 * - intervalo de caracteres. ex.: [0-9] [a-z] [a-zA-Z]
	 * {} quantidade específica de caracteres
	 * ^ negação
	 * \ caracteres pré-definidos
	 *     \d qualquer dígito
	 *     \D qualquer coisa que não seja um dígito
	 *     
	 */
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}", "123.456.789-00"));
	}
	
}
