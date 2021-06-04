package com.intertech.Array3DPractice;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class VarargsPointer {
	
	public static void myMethodTakesLotsOfInts(int[] a, int... manyInts) {
		int j = 0;
		for(int i:manyInts) {
			a[j++] = i;
			System.out.println(i);
			System.out.println(Arrays.toString(a));
		}
	}
	public static void main(String[] args) {
		int[] array = new int[5];
		myMethodTakesLotsOfInts(array,11,22,33,45,5);
	}
}
