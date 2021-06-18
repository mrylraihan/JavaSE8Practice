package com.intertech.InitializationBlockPractice;

public class Person {
	{
		personCount = 10;
	}
	static {
		personCount = 20;
		System.out.println("this is static 20");
	}
	 static int personCount = 1000;
	{
		personCount = 30;
	}
	static {
		personCount = 40;
		System.out.println("this is static 40");
	}
	static {
		personCount = 200;
	}

	public static void main(String[] args) {
		
		System.out.println(Person.personCount); // Line A

		Person p = new Person();// Line B

		System.out.println(Person.personCount);// Line C

		Person.personCount = 100;// Line D

		p = new Person();// Line E

		System.out.println(Person.personCount);// Line F
	}
}