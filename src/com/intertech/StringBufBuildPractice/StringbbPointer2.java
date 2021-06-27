package com.intertech.StringBufBuildPractice;

import java.util.Calendar;
import java.util.Locale;

public class StringbbPointer2 {
	public static void main(String[] args) {
		String name = "Korakot";
		String message = "Hello, ";
		message += name;
		message +=". Today is ";
		message +=
				Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		
		System.out.println(message);
		
		
	StringBuilder sb = new StringBuilder();
	sb.append("Hello, ");
	sb.append(name);
	sb.append(". Today is ");
	sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
	
	System.out.println(sb);
		
	}

}
