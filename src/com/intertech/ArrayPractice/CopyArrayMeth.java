package com.intertech.ArrayPractice;

import java.util.Iterator;

import com.acme.utils.MyDate;

public class CopyArrayMeth {
	public static void main(String[] args) {
		int[] sourceArray = { 1, 2, 3, 4, 5, 6 };
		int[] destinationArray = new int[4];
		System.arraycopy(sourceArray, 0, destinationArray, 0, 3);

		for (int i = 0; i < destinationArray.length; i++) {
			System.out.println(destinationArray[i]);
		}

		int[] array = { 1, 2, 3 };
		int[] temp = array;
		array = new int[4];
		System.arraycopy(temp, 0, array, 0, temp.length);
		temp = null;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		MyDate[] dates = new MyDate[3];
		dates[0] = new MyDate(10, 26, 1999);
		dates[1] = new MyDate(10, 01, 1991);
		dates[2] = new MyDate(2, 16, 1992);

		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i]);
		}
		
		MyDate[] moreDates = { new MyDate(10, 26, 1999),  new MyDate(10, 26, 1999),  new MyDate(10, 26, 1999)};
		
		String [] names = {"Wallie", "Mike", "Ryan"};
		
		
		
	}

}
