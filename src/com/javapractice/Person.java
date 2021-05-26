package com.javapractice;

public class Person {
	{
		personCount = 10;
	}
	static {
		personCount = 20;
	}
	private static int personCount = 1000;
	{
		personCount = 30;
	}
	static {
		personCount = 40;
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