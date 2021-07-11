package com.intertech.ExceptionsPractice;

public class Pointer12 {
	public static void main(String[] args) {
		String name  = "Wallie";
		try {
			System.out.println(name.substring(4));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("your in the String index out of bounds");
		}catch (Exception e) {
			System.out.println("your in the Exception block");
		}finally {
			System.out.println("your in the finally block");
		}
		System.out.println("out of tryblock and rest of program");
	}

}
