package DateAndTimePractice;

import java.time.LocalDate;

public class DateTimeExamples {
	public static void p(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		p(now);
	}
}
