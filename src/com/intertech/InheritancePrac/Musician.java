package com.intertech.InheritancePrac;

public class Musician extends Person{
	
	public static void playDrums() {
		System.out.println("Playing drums");
	}
	public void sayHI() {
		System.out.println("HI im a Drummer");
	 
	}
	
	
	
	
	public static void main(String[] args) {
		Musician m = new Musician();
		m.doSomething();
		m.sayHello("wallie");
		m.sayHI();
	}

}
