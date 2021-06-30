package com.intertech.Basics;

public class SwitchPractice {

	public static void main(String[] args) {

		int j = 3;
		String str = null;

		switch (j) {
		case 1:
			str = "One";
			break;
		case 2:
			str = "Two";
			break;
		case 3:
			str = "Three";
			break;
		case 4:
			str = "Four";
			break;
			default:
				str = "unknown";
		}
		
		System.out.println(str);
		
		
			
		
	}

}
