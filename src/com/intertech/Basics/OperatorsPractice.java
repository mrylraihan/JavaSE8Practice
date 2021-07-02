package com.intertech.Basics;

public class OperatorsPractice {
	static int x;
	static int y; 
	//x++ = [old value: 0, new value: 1, returns old value]
	//++x = [old value: 1, new value: 2, returns new value]
	static void increment() {
		x = 0;
		System.out.println("x equals :"+ x);
		System.out.println("x equals :"+ x++);
		System.out.println("x equals :"+ x);
		System.out.println("x equals :"+ ++x);
		System.out.println("x equals :"+ x);
	}
	
	static void decrement() {
		int y = 0;
		System.out.println("y equals :"+ y);
		System.out.println("y equals :"+ y++);
		System.out.println("y equals :"+ y);
		System.out.println("y equals :"+ ++y);
		System.out.println("y equals :"+ y);
	}
	public static void main(String[] args) {
		increment();
		System.out.println("-------------------->");
		decrement();
		
	}
	
	

}
