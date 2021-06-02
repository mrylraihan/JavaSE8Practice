package com.intertech.DateAndTimeExp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExamples {
	public static void p(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
//		LocalDate Practice
		LocalDate now = LocalDate.now();
		p(now);
		DateTimeFormatter formattingDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		p(now.format(formattingDate));
		
		LocalDate hireDate = LocalDate.of(2020, Month.JULY, 14);
		p(hireDate);
//		
//		LocalDate aWeekfromNow = now.plusWeeks(1);
//		p(aWeekfromNow);
//		
//		LocalDate aWeekAgo = now.minusWeeks(1);
//		p(aWeekAgo);
//		
//		System.out.println(hireDate.isBefore(now));

//		LocalTime Practice		
		LocalTime now1 = LocalTime.now();
		p(now1);
		DateTimeFormatter formattingTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		p(now1.format(formattingTime));
		
//		LocalTime timeHired = LocalTime.of(12, 34, 55);
//		p(timeHired);
//		
//		LocalTime anHourFromNow = now1.plusHours(2);
//		p(anHourFromNow);
//		
//		LocalTime anHourEarlier = now1.minusHours(2);
//		p(anHourEarlier);
//		
//		System.out.println(timeHired.isAfter(now1));
		
//		LocalDateTime practice
		LocalDateTime now2 = LocalDateTime.now();
		p(now2);
//		LocalDateTime timeHired = LocalDateTime.of(2018, Month.JULY, 21, 15, 3);
//		p(timeHired);
//		System.out.println(now2.isAfter(timeHired));
//		Period practice
//		Period secondBachelors = Period.of(2, 0, 0);
//		p(secondBachelors);
//		p(now);
//		now = now.plus(secondBachelors);
//		p(now);
		
//		Periods comparison methods 
		System.out.println(Period.between(hireDate,now));
		Period periods = Period.of(10, 1, 10);
		p(periods);
		
		
	}
}
