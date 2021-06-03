package com.intertech.ArrayPractice2;

public class Pointer {
	public static void main(String[] args) {
		Employee e = new Manager();
//		m.dob;//Person
//		m.name;//Person
//		m.salary//Employee
		Manager m = new Manager();
//		m.department;//Manager
//		m.dob;//Person
//		m.name;//Person
//		m.salary//Employee
		Employee s = new Secretary();
//		m.dob;//Person
//		m.name;//Person
//		m.salary//Employee
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee();
		staff[0].name = "Wallie";
		staff[1] = new Secretary();
		staff[1].name = "Moneypenny";
		staff[2] = new Manager();
		staff[2].name = "Miles";
		((Manager)staff[2]).department = "MI6";
		
//		for(int i = 0; i<staff.length;i++) {
//			System.out.println(i+":"+staff[i].name);
//			System.out.println(staff[i]);
//		}
	//for each loop for iterating through an array	
		for (Employee employee: staff) {
			System.out.println(employee.toString());
		}
	}
	 
}
