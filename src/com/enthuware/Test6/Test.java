package com.enthuware.Test6;

class Person {
	Person(String s, int i) {
		++pid;
		name = s;
		age = i;
	}

	static int pid;
	String name;
	int age;

}

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("John", 22);
		Test te = new Test();
		Person p2 = te.change(p1);
		System.out.println(p2.pid + " " +p2.name+" "+ p2.age);
		System.out.println(p1.pid+ " " +p1.name+" "+ p1.age);
	}

	private Person change(Object o) {
		Person p2 = (Person) o;
		p2.age = 25;
		return p2;
	}
}