package com.intertech.InheritancePrac;

public class PersonTester {
	public static void main(String[] args) {
		Person p = new Person();
		p.doSomething();
		Musician m = new Musician();
		m.playDrums();
		
		
		Person person = new Musician();
		//will only be able to use the instance methods of the Musician class, 
		//not the static methods because its not of type Musician, it will be able to use 
		//the static methods of the Person class.
		
//		Musician musicPerson = new Person(); wont work because Musician
		// is a child of Person
		
		//person.playDrums();
	}
}
