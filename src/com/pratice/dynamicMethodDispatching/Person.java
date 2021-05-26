package com.pratice.dynamicMethodDispatching;

public class Person {
	String firstName = "Wallie";
	String lastName= "Raihan";
	
	public String getDescription() {
		System.out.println("In Person");
		return firstName + " " + lastName;
	}
}
