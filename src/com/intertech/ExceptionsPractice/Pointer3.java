package com.intertech.ExceptionsPractice;

public class Pointer3 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] numlist = { 1, 2, 3, 4, 5 };
		System.out.println(numlist[1]);
		System.out.println("before problem");
		System.out.println(numlist[8]);
	}
}
