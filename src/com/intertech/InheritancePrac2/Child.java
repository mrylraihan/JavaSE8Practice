package com.intertech.InheritancePrac2;


public class Child extends Person{
	MyDate hireDate;
	int salary;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String firstName, String lastName, String address, MyDate dob, MyDate hD, int s) {
		super(firstName, lastName, address, dob);
		this.hireDate = hD;
		this.salary = s;
		
		// TODO Auto-generated constructor stub
	}
	
}
