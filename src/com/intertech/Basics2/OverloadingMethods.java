package com.intertech.Basics2;

public class OverloadingMethods {
	// overloading method means the signature is the same but the parameters are different, or in different order
	// the return type is not part of the signature so change that wont matter in terms of overloading methods
	public static void sumUp(byte a, byte b) {
		System.out.println(a + b + "in byte method");
	}

	public static void sumUp(short a, short b) {
		System.out.println(a + b + "in short method");
	}

	public static void sumUp(int a, int b) {
		System.out.println(a + b + "in int method");
	}
	
	public static void printName(String a) {
		System.out.println(a + " in string single paramter");
	}
	
	public static void printName(String a, String b) {
		System.out.println(a +" "+ b +"in string 2 params");
	}
	public static void main(String[] args) {
		byte a = 1;
		byte b = 2;
		short c = 3;
		short d = 4;
		int e = 2;
		int f = 3;
		
		sumUp(a, b);
		sumUp(c, d);
		sumUp(e, f);
		printName("Heshow");
		printName("Hana", "Bannana");
	}

}
