package com.enthuware.Test6;

public class ArrayPractice2 {

	int change(int x) {
		x = 12;
		return x;
	}

	public static void main(String[] args) {
		int a[][] = new int[3][];
		a[1] = new int[] { 1, 2, 3 };
		a[2] = new int[] { 4, 5 };
		System.out.println(a[1][1]);

		int x = 10;
		int y = new ArrayPractice2().change(x);
		System.out.println(x + y);
	}
}