package com.acme.testing;

import com.acme.utils.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(11, 11, 1918);
		MyDate date2 = new MyDate();
		MyDate date4 = new MyDate();
		
		date4.setDate(13,40,-1);
		
		date2.setDay(11);
		date2.setMonth(11);
		date2.setYear(1918);
		
		MyDate date3 = new MyDate();
		date3.setDate(4, 21, 1968);
		
		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		String str4 = date4.toString();
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("__________________");
		
		MyDate party = new MyDate(4,15,2012);
		MyDate taxDue = new MyDate(4,15,2012);
		System.out.println(party.toString());
		System.out.println(party.equals(taxDue));
		System.out.println(taxDue.equals(party));
		
		System.out.println("__________________");
		
		MyDate javaRelease = new MyDate(3,18,2014);
		String s = "Java SE 8 was released on "+ javaRelease;
		System.out.println(s);
		System.out.println(javaRelease);
		
		MyDate newYear = new MyDate(1,1,2009);
		MyDate fiscalStart = new MyDate(1,1,2009);
		
		if(newYear.equals(fiscalStart)) {
			System.out.println("these two dates are equal");	
		}else {
			System.out.println("these two dates are not equal");	
		}
			
		
		
		
	}
}