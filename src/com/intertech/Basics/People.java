package com.intertech.Basics;

public class People extends Person{

	@Override
	public void doingStuff() {
		System.out.println("doingStuff in People");
		
	}

	@Override
	public void sayName() {
		System.out.println("sayName in People");
		
	}

	@Override
	public void tellUsYourJob() {
		System.out.println("tellUsYourJob in People");
		
	}

}
