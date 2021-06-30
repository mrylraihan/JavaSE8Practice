package com.intertech.Basics;

public class GarabageCollectionsEx2 {
	public static void main(String[] args) {
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
