package com.intertech.Basics;

public class ConditionalsPractice {
	static int age = 1;
	static boolean trOrFls(boolean a) {
		return a;
	}
	static String strTrFlse(String a) {
		return a;
	}
	public static void main(String[] args) {
		String str = "word";
		boolean t = true;
		String message = null;
		if(age == 0) {
			message = "it is 0";
			System.out.println("true " + message);
		}else if( age > 2) {
			message = "it is greater than 2";
			System.out.println("false "  + message);
		}else {
			message = "it is none of the above";
			System.out.println("Stuff "  + message);
		}
		System.out.println("main "  + message);
		
		
		if(trOrFls(t)) {
			System.out.println("method in conditonal is true");
		}else if(trOrFls(t) == false) {
			System.out.println("method in conditional is false");
		}
		
//		if(strTrFlse("Hello")) {
//			this method wont work in the condition because it does'nt return a boolean value
//		}
		
		if (strTrFlse("word") == str) {
			System.out.println("this is the same word as the string");
		}else {
			System.out.println("this does'nt work");
		}
		
	}

}
