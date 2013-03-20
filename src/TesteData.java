

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TesteData {
	
	public static void main(String[] args) {
		
		//Objeto responsável pelo formato de apresentação e conversão
		//de Date para String e de String para Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		
		Date d1 = new Date();
		
		System.out.println(d1);
		//Apresenta a data d1 utilizando o formato dd/MMM/yyyy
		System.out.println(sdf.format(d1));
		
		//Objeto responsável por permitir a manipulação da Data,
		//avançando e recuando no tempo
		Calendar c = GregorianCalendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		
		//define em que tempo estamos no calendário
		c.setTime(d1);
		//avança no calendário em 3 dias
		c.add(Calendar.DATE, 3);
		//Qual o dia da semana no calendário
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(sdf.format(c.getTime()));
		//a diferença entre dois instantes de tempo (dois objetos Date)
		//é em milisegundos
		long tempo = c.getTimeInMillis()-d1.getTime();
		System.out.println(tempo);
		//Obtém a diferença do tempo em horas
		System.out.println(tempo/1000/60/60);
		
		Date d2 = null;
		try {
			//Realiza a conversão de String para Date
			d2 = sdf.parse("02/Fev/2002");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d2);
		System.out.println(c2.getTime());
	}
	
}
