package com.intertech.ExceptionsPractice;

public class NPointer {
	public static void main(String[] args) {
		String a = null;
		String[] wordList = null;
		
		
		try {
			System.out.println(wordList.length);
			System.out.println(a.length());
			
		} catch (NullPointerException e) {
			System.out.println("Sorry this is caused a null pointer exception");
		}finally {
			System.out.println("in the finally block");
		}
		System.out.println("Rest of the program");
		
	}

}
