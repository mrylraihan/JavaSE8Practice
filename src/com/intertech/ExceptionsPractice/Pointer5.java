package com.intertech.ExceptionsPractice;

public class Pointer5 {
	public static void main(String[] args) {
		
		
		try {
			String a = null;
//			int aa = a.charAt(0);
			
			System.out.println("in try block");
			
		} catch (NullPointerException e) {
			System.out.println("a is null");
			
		}finally {
			System.out.println("in finally block");
		}
		System.out.println("Rest of program");
	}

}
