package com.intertech.Basics;

public class Seat1 extends Student {
public static void main(String[] args) {
	Student student = new Student();
	
	student.sayName();
	student.tellUsYourJob();
	student.doingStuff();
	student.sayBye();
	student.sayHi();
	
	People people = new People();
	
	people.sayName();
	people.tellUsYourJob();
	people.doingStuff();
	people.sayHi();
	people.sayBye();
	
	
	//because People is an abstract class we need to have an anonymous inner class 
	//to get a concrete version of that class
	Person p1 = new Person() {
		
		@Override
		public void tellUsYourJob() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void doingStuff() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void sayName() {
			// TODO Auto-generated method stub
			
		}
	};
	
}
}
