package com.pratice.dynamicMethodDispatching;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person();
//		System.out.println(p.getDescription());
//		System.out.println("-----------------");
//		Person pe = new Employee();
//		System.out.println(pe.getDescription());
//		System.out.println("-----------------");
//		Employee e = new Employee();
//		System.out.println(e.getDescription());
//		System.out.println("-----------------");
		
		
		
		//Object casting
		Person p1 = new Employee();
		System.out.println(p1.getDescription());
		Employee e = (Employee) p1;
		e.title = "Instructor";//Legal because title is defined in Employee
		System.out.println(e.title +" "+ e.firstName);
		
		System.out.println("-----------------");
		//another way to cast an Object 
		
		Person p2 = new Employee();
		((Employee)p2).title = "Web Developer";
		System.out.println(p2.getDescription());
		
		System.out.println("-----------------");
		
		Person p3 = new Employee();
		
		if(p3 instanceof Employee) {
			((Employee)p3).title = "Director";
		}
		System.out.println(p3.getDescription());
		
		
	}

}
