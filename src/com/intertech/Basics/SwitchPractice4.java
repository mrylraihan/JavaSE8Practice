package com.intertech.Basics;

public class SwitchPractice4 {
	//Switch cases work with compile time constants 
	public static void main(String[] args) {
		int j = 3;
		final int a = 3;
		final int c = 2;
		final int y = 1;
		String str = null;

		switch (j) {
		case y:
			str = "One";
			break;
		case c:
			str = "Two";
			break;
		case a:
			str = "Three";
			break;
		case 4:
			str = "Four";
			break;
			default:
				str = "unknown";
		}
		
		System.out.println(str);
		
		int num = 2;
		String strs = null;
		switch(num) {
		case 1:
		case 3:
			strs = "odd";
			break;
		case 2:
		case 4:
			strs = "even";
			break;
		default:
			strs = "out of range";
			break;
		}
		System.out.println(strs);
		
	}
}
