package com.intertech.ExceptionsPractice;

public class Pointer10 {
	public static void main(String[] args) {
		int[] numlist = { 1, 2, 3, 4, 5 };
		String a = null;
		try {
			System.out.println("before try");
			numlist[5] = 6;
			System.out.println("after exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("hey bro you out of bounds");
			
			try {
				System.out.println(a.length());

			} catch (NullPointerException b) {
				System.out.println("you in the null pointer bro");
			}

		}
	}
}