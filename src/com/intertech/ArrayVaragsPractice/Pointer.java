package com.intertech.ArrayVaragsPractice;

import java.util.Arrays;

public class Pointer {

	public static void myMethodTakesLotsOfInts(int[] a, int... manyInts) {
		int j = 0;
		for(int i:manyInts) {
			a[j++] = i;
			System.out.println(i);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void printingNames(String...a ) {
		System.out.println(Arrays.deepToString(a));
		
	}
	
	public static void printNums(int...a) {
		System.out.println(Arrays.toString(a));
	}
	
	
	
	public static void main(String[] args) {
		int[] array = new int[5];
		myMethodTakesLotsOfInts(array,11,22,33,45,5);
		
		int[] array1 = new int[10];
		myMethodTakesLotsOfInts(array1, 1,2,3,4,5,6,7,8,9,10);
		
		printingNames("Wallie","Wallie", "Wallie", "Walliee");
		
		printNums(1,2,3,4,5);
		
		char[] letters2 = {'a','e','c','w'};
		Arrays.sort(letters2);
		int eLocation = Arrays.binarySearch(letters2, 'b');
		System.out.println(eLocation);
		
	}
}
