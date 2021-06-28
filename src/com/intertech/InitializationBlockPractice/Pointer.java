package com.intertech.InitializationBlockPractice;

public class Pointer {
	static int i;
	{
		System.out.println("in instance block");
		i = 5;
	}
	
	
	static {
		i = 2;
		System.out.println("in first static block");
	}
	static {
		i = 1;
		System.out.println("in second static block");
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		Pointer p = new Pointer();
		System.out.println(i);
		Pointer p2 = new Pointer();
		System.out.println("in main method");
		System.out.println(i);
		
	}
}
