package com.intertech.InheritancePrac2;

public class Pointer1 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println("------>");
		Child1 b = new Child1("Wallie");
		System.out.println(b.name);
		Parent1 p1 = new Child1();//if the reference type is a parent and the object is a subclass this is legal
		b = (Child1) p1;// because p1 is an object of the subclass you can cast it back to a subclass
		System.out.println(b.name);
		
	}
}
