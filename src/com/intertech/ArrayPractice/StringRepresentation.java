package com.intertech.ArrayPractice;

import java.util.Arrays;

public class StringRepresentation {
	public static void main(String[] args) {
		// Declaration and initialization
		int[][][] threeDimArr = new int[4][5][6];

		// Declaration and initialization at the same time
		int[][][] threeDimArr1 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		// Access an Array
		int x = threeDimArr[1][0][1];
		//another way to access an Array 
		int[][] row = threeDimArr[1];
		
		//String representation of an Array 
		String y = Arrays.deepToString(threeDimArr1);
		System.out.println(y);
		
		//declaring an array 
		
		int[] numberS2;
		int numberS3[];
		int numberS6[][][];
		int[][][] numberS7;
		// initializing an array
		int numberS4[]= new int[3];
		int numberS5[]= {1,2,3,4,5};
		
	
	}

}
