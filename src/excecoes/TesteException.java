package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class TesteException {
	
	public static void main(String[] args) {
		//Exemplo de UncheckedException - não é detectada na compilação
		float divisao = 0;
		try {
			divisao = 3/0;//Se a exceção ocorreu neste ponto, as demais linhas do bloco try
						  //não serão executadas
			//Linha...
			//Linha...
		} catch(ArithmeticException e) { //Captura apenas Exceções do tipo Arithmetic
			System.out.println("Erro de divisão por zero! Favor informar outro valor");
		} catch(Exception e) { //Captura Exceções de qualquer natureza
			e.printStackTrace();
		} finally { //bloco executado SEMPRE, independentemente de ter ocorrido erro ou não
			System.out.println(divisao);
		}
		
		//Exemplo de CheckedException - é detectada na compilação
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date data = sdf.parse("02/02/2002");
		} catch (ParseException e) {
			System.out.println("Data informada inválida!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
