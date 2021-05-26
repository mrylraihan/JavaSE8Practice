package com.pratice.dynamicMethodDispatching;

public class Employee extends Person{
	String title = "developer";
	String firstName = "Wayel";

	public String getDescription() {
		System.out.println("In Employee" +" "+ firstName);
		return super.getDescription() + " : " + title;
	}
}
