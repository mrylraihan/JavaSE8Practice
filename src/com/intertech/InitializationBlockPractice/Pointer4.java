package com.intertech.InitializationBlockPractice;

public class Pointer4 {
	
	public Pointer4() {
		in = "in";
	}
	static String in = "SIN";
	{
		String in = "IN";
		System.out.println(in);
	}
	
	static String s = "s";
	
	static {
		s = "S";
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("The value of s is: "+ s);
		System.out.println("The value of in is: "+ in);
		Pointer4 p = new Pointer4();
		System.out.println("The value of in is: "+ in+" "+s);
	}

}
