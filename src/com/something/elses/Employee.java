package com.something.elses;

import com.intertech.InheritancePrac.Musician;
import com.intertech.InheritancePrac.Person;

public class Employee extends Person {


	public void testingProtectedMethod() {
		doSomething(); // Legal to call a protected method from the class we extending from
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.doSomething();
		Person.sayHello("Mike");
		Person p = new Person();
//		p.doSomething(); Illegal
		Musician m = new Musician();
//		m.doSomething(); Illegal
	}

}
