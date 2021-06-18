package com.intertech.ExceptionsPractice;

public class Pointer7 {
	public static void main(String[] args) {
		String a = "Hello";

		WordChecking words = (x) -> {
			try {
				
			System.out.println(x.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Sorry string index out of Bounds");
		};};
		
		
		words.wordIndex(a);
		words.wordIndex("!@#$%%^7676767676");
	}
}