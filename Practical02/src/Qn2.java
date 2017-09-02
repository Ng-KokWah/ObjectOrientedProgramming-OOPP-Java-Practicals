import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
public class Qn2 {
	public static void main (String[] args) {
		GregorianCalendar currentDate = new GregorianCalendar();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("Current Date :"+format.format(currentDate.getTime()));
		
		GregorianCalendar birthday = new GregorianCalendar(1998,03,07);
		System.out.println("My birthday is on "+format.format(birthday.getTime()));
		
		LocalDate today = LocalDate.now();
		LocalDate dayAfterTmr = today.plusDays(2);
		LocalDate dateOfBirthday = LocalDate.of(1999, Month.DECEMBER, 25);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
		
		System.out.println("The day after tmr is "+dayAfterTmr.format(formatter));
		System.out.println("My birthday is "+dateOfBirthday.format(formatter));
	}
}
