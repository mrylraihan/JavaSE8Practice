package com.enthuware.Test5;

public class CreatingAndUsingArrays {
	public static void main(String[] args) {
		//array 1 is the only one that is a single dimensional array
		int [] array1, array2[];
		int [][] array3;
		int[] array4[], array5[];
		int [] a[] = new int [5][4];
		
		//the following are valid;
		//array2 = array3
		//array2 = array4
		//array5 = array3
		int k = 5;
		while( k <7) {
			System.out.println(k++);
		}
	}

}
