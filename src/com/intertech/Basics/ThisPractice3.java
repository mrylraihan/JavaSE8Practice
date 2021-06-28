package com.intertech.Basics;

public class ThisPractice3 {
	int a; 
	int b;
	
//	public static void setData(int a, int b) { because this method is static 
//		this.a = a;							   we can't use this keyword to point it to our
//		this.b = b;							   instance variables
//	}
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		
		ThisPractice3 tp = new ThisPractice3();
		tp.setData(1, 2);
		System.out.println(tp.a);
		System.out.println(tp.b);
		
	}

}
