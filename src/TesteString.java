
public class TesteString {

	/**
	 * Esta classe � utilizada para testar os diversos m�todos de String
	 * @param args N�o � utilizado
	 */
	public static void main(String[] args) {
		String texto = " abcdefgh ";
		System.out.println("Char da posi��o 1: " + texto.charAt(1));
		System.out.println("Qtde de caracteres: " + texto.length());
		texto = texto.trim();
		System.out.println("Qtde de caracteres ap�s o trim: " + texto.length());
		System.out.println("Letras Mai�sculas: " + texto.toUpperCase());
		System.out.println("Letras Mai�sculas: " + texto.toLowerCase());
		System.out.println(texto.indexOf("cd"));
		System.out.println(texto);
	}

}
