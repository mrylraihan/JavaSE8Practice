package com.intertech.InheritancePrac;

import java.time.LocalDate;

public class Tester{
	
	public static String firstName = "Jason";
	
	static
	{
		firstName = "Wallie";
	}
	
	
	
	public static void main(String[] args) {
		Father ff = new Father();
		Father f = new Son();
		Son s = new Son();
		
		System.out.println("Father ff = new Father()------------------>");
		ff.sayHello();
		ff.sayHi();
		
		System.out.println("Father f = new Son()------------------>");
		f.sayHello(); 
		f.sayHi();
		f.running();
//		f.walking(); it wont allow you to use the child method because 
//		of its a reference type of Father
		System.out.println("Son s = new Son()----------------->");
		s.sayHello();
		s.sayHi();
		s.driveLikeDad();
		
		System.out.println(firstName);
		
		
	}
}

