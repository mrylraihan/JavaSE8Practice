package com.intertech.InheritancePrac;

public class Person {
	
	 public void sayHI() {
		System.out.println("HI im a Person");
	}
	
	public static void sayHello(String firstName, int age) {
	
	}
  
	public static void sayHello(String name) {
		System.out.println("Hi, its "+name);
	}

	protected void doSomething() {
		System.out.println("do something in person");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.doSomething();
		p.sayHI();

	}

}