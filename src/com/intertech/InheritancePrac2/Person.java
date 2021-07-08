package com.intertech.InheritancePrac2;



public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private MyDate dob;
	String fullName = "fullname";
	static String fulllastName = "static variable in Person";
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public Person(String firstName, String lastName, String address,MyDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
	}
	
	
	public  Person() {
		this("Wallie", "Raihan","181 28th street", new MyDate(10,10,1991));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName+" "+address+" "+dob;
	}
}
