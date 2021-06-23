package com.enthuware.OverridingPractice;

public class Pointer {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal animal = new Animal();
		Animal dog2 = new Dog();
		dog.speak();
		dog.walk();
		animal.speak();
		animal.walk();
		dog2.speak();
		
	}
}
