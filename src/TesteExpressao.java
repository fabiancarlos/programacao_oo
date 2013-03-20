import java.util.regex.Pattern;


public class TesteExpressao {

	/*
	 *  * Qualquer cadeia de caracteres
	 *  ? uma ou nenhuma vez
	 *  + uma ou mais vezes
	 *  [] um dos elementos do conjunto. ex: [abc] [123]
	 *  . qualquer caractere
	 *  ^ exclusão. ex: [^0-3]
	 *  - intervalo. ex: [a-z] [0-9]
	 *  {} quantidade de repetições. ex: [0-9]{5}
	 *  \ classe de caracteres pré-definidos
	 *        \d um dígito
	 *        \D algo que não seja um dígito
	 *        \s um espaço em branco
	 *        \S algo que não seja um espaço em branco
	 *        \w qualquer letra, dígito ou underscore
	 *        \W algo que não seja letra, dígito ou underscore
	 */
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}", "000.000.000-00"));
	}
	
}
