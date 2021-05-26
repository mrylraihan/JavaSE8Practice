package com.constructorChaining;

import com.acme.utils.MyDate;

public class Employee extends Person{
	private MyDate hireDate;
	private int salary;
	
	


	public int promote(int percent) {
		return salary  *= 1 + (percent/100);
	}
	
	
	public Employee(String fName, String lName, Address add, MyDate dob, MyDate hDate, int sal) {
		super(fName, lName, add, dob);
		this.hireDate = hDate;
		this.salary = sal;
		
		
	}
	public Employee() {
		super();
	}

}
