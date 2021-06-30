package com.intertech.Basics;

public class GarabageCollectionsEx2 {
	
	public static void main(String[] args) {
		//theres only 2 ways when an object isnt reachable and the JVM 
		//knows when something is eligible for garbage collection 
		
		//1) the object is no longer has any references pointing to it 
		//2) All references to the object have gone out of the scope 
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		//new String("a") has no reference variable 
		String three = one;
		one = null;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}
