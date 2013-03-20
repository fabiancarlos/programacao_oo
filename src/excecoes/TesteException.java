package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class TesteException {
	
	public static void main(String[] args) {
		//Exemplo de UncheckedException - n�o � detectada na compila��o
		float divisao = 0;
		try {
			divisao = 3/0;//Se a exce��o ocorreu neste ponto, as demais linhas do bloco try
						  //n�o ser�o executadas
			//Linha...
			//Linha...
		} catch(ArithmeticException e) { //Captura apenas Exce��es do tipo Arithmetic
			System.out.println("Erro de divis�o por zero! Favor informar outro valor");
		} catch(Exception e) { //Captura Exce��es de qualquer natureza
			e.printStackTrace();
		} finally { //bloco executado SEMPRE, independentemente de ter ocorrido erro ou n�o
			System.out.println(divisao);
		}
		
		//Exemplo de CheckedException - � detectada na compila��o
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date data = sdf.parse("02/02/2002");
		} catch (ParseException e) {
			System.out.println("Data informada inv�lida!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
