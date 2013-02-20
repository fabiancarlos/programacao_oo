package supermecado;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TesteData {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());
		gc.add(Calendar.DAY_OF_YEAR, 28);
		System.out.println(gc.getTime());
		
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		
//		public static ArrayList<NotaFiscal> getNotaFiscalByMonth(int month, int year) {
			
//		}
	}
	
}
