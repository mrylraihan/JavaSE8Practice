package DateAndTimePractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest {
	public static void p(Object o) {
		System.out.println(o);
	}
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(now.format(dtf));
		DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(now.format(longFormat));
		DateTimeFormatter medFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(now.format(medFormat));
		DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(now.format(shortFormat));
		
		System.out.println("----------------------->");
		
		
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		DateTimeFormatter tdtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(now1.format(tdtf));
		DateTimeFormatter shorttdtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(now1.format(shorttdtf));
		
		System.out.println("----------------------->");
		
		
		LocalDateTime now3 = LocalDateTime.now();
		p( now3);
		DateTimeFormatter dtdtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(now3.format(dtdtf));
		
		DateTimeFormatter dtdtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
		System.out.println(now3.format(dtdtf2));
	}

} 
