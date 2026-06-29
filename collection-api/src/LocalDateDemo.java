import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2012,02,13);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2018-05-19");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(1));
		System.out.println(d1.minus(1,ChronoUnit.MONTHS));
		System.out.println(d1.getDayOfWeek());
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.isLeapYear());
		
		LocalDate dob = LocalDate.of(2005,9,21);
		System.out.println(dob);

		//calculate age based on dob
		//System.out.println(Period.between(dob, LocalDate.now()).getYears());
		System.out.println(ChronoUnit.YEARS.between(dob, LocalDate.now()));
	}
}
