package com.intertech.InheritancePrac2;


public class Pointer {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getFullName());
		System.out.println(p.toString());
		System.out.println("---------->");
		System.out.println(p.fullName);
		Person m = new Person("Mike", "Luca", "Staten island", new MyDate(7,8,1995));
		System.out.println(m.toString());
		System.out.println(m.getFullName());
		Child c = new Child();
		System.out.println(c.getFullName());
		Child cc = new Child("CC","Tyson","Brooklyn", new MyDate(9,10,1999), new MyDate(10,10,2020), 100000 );
		System.out.println(cc.toString());
		System.out.println(cc.getFullName());
		System.out.println(cc.fullName);
		System.out.println("cc is getting a salary of "+cc.salary+" and was hired on "+cc.hireDate);
		System.out.println(Person.fulllastName +" & "+ Child.fulllastName);
		System.out.println(p.fulllastName+ " & " +cc.fulllastName);
	}

}
