package com.intertech.ArrayMethodsPractice;

import java.util.Arrays;

public class Pointer {
	public static void main(String[] args) {
		char[] letters = {'d', 'a', 'b', 'x', 'c', 'y', 'w'};
		
		System.out.println("Modified letters[] :"+ Arrays.toString(letters));
		
		Arrays.sort(letters);

		System.out.println("Modified letters[] :"+ Arrays.toString(letters));
		int wLocation = Arrays.binarySearch(letters, 'e');
		System.out.println(wLocation);
		
		char[] letters2 = {'a','b','c','w'};
		int eLocation = Arrays.binarySearch(letters2, 'e');
		System.out.println(eLocation);
		
		Arrays.fill(letters2, 'z');
		System.out.println(Arrays.toString(letters2));
	
		char[] letters3 = new char[10];
		Arrays.fill(letters3, 'a');
		System.out.println(Arrays.toString(letters3));
		
		String[] letters4 = new String[5];
		Arrays.fill(letters4, "a");
		System.out.println(Arrays.toString(letters4));
		System.out.println(Arrays.deepToString(letters4));
		
		String[] letters5 = Arrays.copyOfRange(letters4, 0, 3);
		System.out.println(Arrays.toString(letters5));
		
		for(int i = 0; i<letters5.length;i++) {
			
			System.out.println(letters5[i]);
		}
		
		String name = "Wallie";
		System.out.println(name.length());
		System.out.println(letters5.length);
	}

}
