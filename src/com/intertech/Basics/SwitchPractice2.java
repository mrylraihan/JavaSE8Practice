package com.intertech.Basics;

public class SwitchPractice2 {
	public static void main(String[] args) {
		int day = 3;
		switch (day){
		case 1:
			System.out.println("we are on the first day of the week");
			break;
		case 2:
			System.out.println("we are on the second day of the week");
			break;
		default:
			System.out.println("we are in the default");
		case 3:
			System.out.println("we are on the third day of the week ");
			break;
		case 4:
			System.out.println("we are on the fourth day of the week");
			break;
		case 5:
			System.out.println("we are on the fifth day of the week");
			break;
		}
		
		
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		default:
			System.out.println("weekday");
			break;
		case 0 :
			System.out.println("its sunday");
			break;
		case 5:
			System.out.println("its friday");
			break;
		}
		
	}

}
