package com.enthuware.Test5;

public class UsingLoopsConstructs {
	static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
	public static void main(String[] args) {
		int index = 0;
		for (String day : days) {

			if (index == 3) {
				break;
			} else {
				
			}
			
			System.out.println(index);
			if (days[index].length() > 3) {
				days[index] = days[index].substring(0, 3);
			}
			index++;
		}
		System.out.println(days[index]);
	}
}
