package com.enthuware.Test6;

import java.util.Iterator;

public class UsingArrays2 {
	public static void main(String[] args) {
		int size = 10;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);

			System.out.println("------------------>");

			String str = "111";
			boolean[] bA = new boolean[1];
			if (bA[0])
				str = "222";
			System.out.println(str);
			System.out.println(bA[0]);
			
			int count = 0, sum = 0;
			do{
			       if(count % 3 == 0) continue;
			       sum+=count;
			}
			while(count++ < 11);
			System.out.println(sum);
		}
	}
}
