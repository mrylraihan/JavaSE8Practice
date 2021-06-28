package com.intertech.Basics;

public class ThisPractice2 extends parentThis {
	String name;
	int age;

	public ThisPractice2(String name, int age) {

		super(name, age);
		this.name = name;
		this.age = age;
		System.out.println("in child constructor " + this.age + " ," + this.name);
	}

	public ThisPractice2() {
		this("Wayel", 28);

	}

	public static void main(String[] args) {
		ThisPractice2 tp = new ThisPractice2("Wallie", 29);
		ThisPractice2 tp2 = new ThisPractice2();
		parentThis pt = new parentThis("Dad", 56);
		System.out.println(parentThis.personCount);
	}

}

class parentThis {
	String name;
	int age;
	static int personCount;

	public parentThis(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("in parent constructor " + this.age + " ," + this.name);
	}

	public parentThis() {
		personCount++;
	}
}