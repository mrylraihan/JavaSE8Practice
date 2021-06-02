package com.intertech.DateTimeLambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pointer {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		DateFunctionalInterface innerClass = new DateFunctionalInterface(){

			@Override
			public void fixDate(LocalDate d) {
				DateTimeFormatter patternFormatter2 = DateTimeFormatter.ofPattern("dd' is the day in the year 'yyyy");
				System.out.println((d.format(patternFormatter2)));
			}
			
		};
		
		innerClass.fixDate(now);
	}



}
