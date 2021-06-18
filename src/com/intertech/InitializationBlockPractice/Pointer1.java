package com.intertech.InitializationBlockPractice;

public class Pointer1 {
	public Pointer1() {
		s1 = sM1("1");
	}

	static String s1 = sM1("a");
	String s3 = sM1("2");
	{
		s1 = sM1("3");
	}
	static {
		s1 = sM1("b");
	}
	static String s2 = sM1("c");
	String s4 = sM1("4");
	
	private static String sM1(String s) {
		System.out.print(s);
		return s;
	}
	public static void main(String args[]) {
//		System.out.println(s1);
		Pointer1 it = new Pointer1();
	}

	
}
