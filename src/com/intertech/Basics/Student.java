package com.intertech.Basics;

public class Student extends People{
	
	@Override
	public void doingStuff() {
		System.out.println("doingStuff in Student");
		
	}

	@Override
	public void sayName() {
		System.out.println("sayName in Student");
		
	}

	@Override
	public void tellUsYourJob() {
		System.out.println("tellUsYourJob in Student");
		
	}
	
	

}
