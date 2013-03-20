import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class TesteDate {

	public static void main(String[] args) throws HeadlessException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		System.out.println(sdf.format(d));
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(sdf.parse(JOptionPane.showInputDialog("Digite a Data")));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		calendar.add(Calendar.YEAR, 1);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.getTime());
		
	}
	
}
