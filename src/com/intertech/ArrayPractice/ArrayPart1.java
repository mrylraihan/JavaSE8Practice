package com.intertech.ArrayPractice;

public class ArrayPart1 {
	public static void main(String[] args) {

		// both declarations are valid
//	int intArray[];
		// or
//	int [] intArray2;
//	
//	//multiple arrays in one line
//	char[] charArray1, charArray2;
		 
//	This wont work due to placement
// char chaArrayThree[], charOne;

		// how to instantiate an array

		int[] intArray = new int[10];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		intArray[6] = 7;
		intArray[7] = 8;
		intArray[8] = 9;
		intArray[9] = 10;
		// how to declare , initialize, and as sign an array
		int[] intArray2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] intArray3 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] data;
		data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] intArray4;
		intArray4 = new int[] { 1, 2, 3, 4 };

		System.out.println(intArray.length);
		System.out.println(intArray2.length);
		System.out.println(intArray3.length);
		System.out.println(intArray4.length);

		int[] anArray = new int[10];
		for (int i = 0; i < anArray.length; i++) {
			anArray[i] = i * i;
			System.out.println(anArray[i]);
		}
		System.out.println("--------------------------->");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println("intArray2 :" + intArray2[i]);
		}

	}
}