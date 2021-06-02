package com.intertech.DateTimeLambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pointer2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter patternFormatter2 = DateTimeFormatter.ofPattern("dd' is the day in the year 'yyyy");
		
		DateFunctionalInterface dateLambda = (a)->System.out.println((a.format(patternFormatter2)));
		
		dateLambda.fixDate(now);
	}

}