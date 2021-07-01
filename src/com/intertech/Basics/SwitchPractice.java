package com.intertech.Basics;

public class SwitchPractice {
//following datatypes supported by switch statements
//int, Integer, byte, Byte, short, Short, char, Character, String, enum values, var
	
//following data types not supported by switch statments 
//Boolean, boolean, double, Double, Long, long, float, Float

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
		
		
		String timeOfDay = "am";
			switch(timeOfDay) {
			case "pm":
				System.out.println("its pm");
				break;
			case "am":
				System.out.println("its am");
				break;
			case "mp":
				System.out.println("its mp");
				break;
				default:
					System.out.println("we dont know the time");
			}
		
	}

}
