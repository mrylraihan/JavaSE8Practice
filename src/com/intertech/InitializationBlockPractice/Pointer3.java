package com.intertech.InitializationBlockPractice;

public class Pointer3 {
	static {
		System.out.println("static block");
	}
	{
		System.out.println("Initialization block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		Pointer3 p3 = new Pointer3();
	}
	{
		System.out.println("Initialization block after Main");
	}
	static {
		System.out.println("Static block after Main");
	}
}
