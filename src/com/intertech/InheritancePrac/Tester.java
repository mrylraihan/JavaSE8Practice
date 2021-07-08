package com.intertech.InheritancePrac;

public class Tester{
	
	public static String firstName = "Jason";
	
	static
	{
		firstName = "Wallie";
	}
	
	
	
	public static void main(String[] args) {
		Father ff = new Father();
		Father f = new Son();
		Son s = new Son();
		
		System.out.println("Father ff = new Father()------------------>");
		ff.sayHello();
		ff.sayHi();
		System.out.println(ff.father);
		System.out.println("Father f = new Son()------------------>");
		f.sayHello(); 
		f.sayHi();
		f.running();
//		f.walking(); it wont allow you to use the child method because 
//		of its a reference type of Father
		System.out.println(f.father);// can only access instance variables in father
		System.out.println("Son s = new Son()----------------->");
		s.sayHello();
		s.sayHi();
		s.driveLikeDad();
		System.out.println(s.father);// will use the parents instance variable father unless it has an overridden
		//instance vaiable father in its own class
		System.out.println(s.son);
		System.out.println("--------->");
		
		System.out.println(firstName);
		
		
	}
}

