package com.intertech.abstract3;

public abstract class Employee extends Person{
	protected String title;
	public abstract double pay();
	public String getName() {
		return title +" : "+ firstName;
	}

}
