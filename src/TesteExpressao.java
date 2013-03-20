import java.util.regex.Pattern;


public class TesteExpressao {

	/*
	 *  * Qualquer cadeia de caracteres
	 *  ? uma ou nenhuma vez
	 *  + uma ou mais vezes
	 *  [] um dos elementos do conjunto. ex: [abc] [123]
	 *  . qualquer caractere
	 *  ^ exclus�o. ex: [^0-3]
	 *  - intervalo. ex: [a-z] [0-9]
	 *  {} quantidade de repeti��es. ex: [0-9]{5}
	 *  \ classe de caracteres pr�-definidos
	 *        \d um d�gito
	 *        \D algo que n�o seja um d�gito
	 *        \s um espa�o em branco
	 *        \S algo que n�o seja um espa�o em branco
	 *        \w qualquer letra, d�gito ou underscore
	 *        \W algo que n�o seja letra, d�gito ou underscore
	 */
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}", "000.000.000-00"));
	}
	
}
