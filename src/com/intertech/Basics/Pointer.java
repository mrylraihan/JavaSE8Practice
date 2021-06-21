package com.intertech.Basics;

import java.util.Arrays;

public class Pointer {
	public static void main(String[] args) {
		//primitive data types
		//8 primitive data types: byte, short, int , long, float, double, boolean, and char
		//primitive are just a single value, with only one state and no behavior
		//everything else is an object
		// the JVM treats the primitives more efficiently then an object
		byte a = 1;
		short b = 10;
		int c = 20;
		long d = 30;
		float e= 20.00f;
		double f = 30.00;
		boolean g = true;
		boolean h = false;
		char i = 'i';
		System.out.println();
		
		int[] numList = {1,2,3,4};
		String y = Arrays.toString(numList);
		System.out.println(y);
	}
}
