package com.constructorChaining;

import com.acme.utils.MyDate;

public class Person {
	private String firstName;
	private String lastName;
	private Address homeAddress;
	private MyDate dob;
	
	public String getFullname() {
		return firstName + " " + lastName;
	}
	
	public Person(String fName, String lName, Address add, MyDate date) {
		this.firstName = fName;
		this.lastName = lName;
		this.homeAddress = add;
		this.dob = date;
	}
	
	public Person() {
		this("Jane", "Doe", null, new MyDate(1,1,1900));
	}
	

}
