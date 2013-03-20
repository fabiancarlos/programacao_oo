
public class TesteString {

	/**
	 * Esta classe é utilizada para testar os diversos métodos de String
	 * @param args Não é utilizado
	 */
	public static void main(String[] args) {
		String texto = " abcdefgh ";
		System.out.println("Char da posição 1: " + texto.charAt(1));
		System.out.println("Qtde de caracteres: " + texto.length());
		texto = texto.trim();
		System.out.println("Qtde de caracteres após o trim: " + texto.length());
		System.out.println("Letras Maiúsculas: " + texto.toUpperCase());
		System.out.println("Letras Maiúsculas: " + texto.toLowerCase());
		System.out.println(texto.indexOf("cd"));
		System.out.println(texto);
	}

}
