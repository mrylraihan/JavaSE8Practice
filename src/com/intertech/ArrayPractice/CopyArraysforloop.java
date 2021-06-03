package com.intertech.ArrayPractice;

import java.util.Iterator;

public class CopyArraysforloop {
	public static void main(String[] args) {

//how to copy an array with a forloop

		int a[] = { 1, 2, 3 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("----------------------------------->");

		int c[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int d[][] = new int[c.length][c[0].length];
		// for loop copying an array
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				d[i][j] = c[i][j];
			}
		}
//		//foreach copying an array
//		int i = 0;
//		for (int[] is : c) {
//			int temp[] = new int[is.length];
//			int j = 0;
//			for (int is2 : is) {
//			temp[j++]= is2;
//			}
//			d[i++] = temp;
//		}

		for (int[] j : d) {
			for (int k : j) {
				System.out.println(k);
			}
		}
		
		System.out.println("----------------------------------->");
		int threeDArray[][][] = {  { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		int copy3DArray[][][] = new int[threeDArray.length][threeDArray[0].length][threeDArray[0][0].length];
		
		for (int i = 0; i < threeDArray.length; i++) {
			for (int j = 0; j < threeDArray[0].length; j++) {
				for(int h = 0; h < threeDArray[0][0].length; h++)
				copy3DArray[i][j][h] = threeDArray[i][j][h];
			}
		}
		
		for (int[][] is : copy3DArray) {
			for (int[] is2 : is) {
				for (int is3 : is2) {
					System.out.println(is3);
				}
			}
		}
	}
}