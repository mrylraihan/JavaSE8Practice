package DateAndTimePractice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormaterExamples {
	public static void p(Object o) {
		System.out.println(o);
	}
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		p(now);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		p(now.format(dtf));
		
		DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("yyyy/dd/M");
		p(now.format(patternFormatter));
		
		DateTimeFormatter patternFormatter2 = DateTimeFormatter.ofPattern("dd' is the day in the year 'yyyy");
		p(now.format(patternFormatter2));
		
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter timepattern = DateTimeFormatter.ofPattern("hh:mm:ss");
		p(time.format(timepattern));
	}
}
