package com.intertech.ExceptionsPractice;

public class Pointer9 {
	public static void main(String[] args) {
		try {
			System.out.println("before throws");
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
