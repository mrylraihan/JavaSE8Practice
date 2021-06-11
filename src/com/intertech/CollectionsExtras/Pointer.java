package com.intertech.CollectionsExtras;

import java.util.Arrays;
import java.util.List;

import com.intertech.CollectionsMapsPractice.MyDateEx;

public class Pointer {
	public static void main(String[] args) {
		List<MyDateEx> dates = Arrays.asList(new MyDateEx(2, 1, 2020), new MyDateEx(3, 10, 1980));
		System.out.println(dates);
		System.out.println(dates.get(1));
		
		System.out.println("-------------------------->");
		
		MyDateEx[] datesArray = { new MyDateEx(2,1,2020), new MyDateEx(3,10,1980) };
		List<MyDateEx> dates2 = Arrays.asList(datesArray);
		
		List<MyDateEx> dates3 = Arrays.asList(new MyDateEx(2,1,2020), new MyDateEx(3,10,1980));//this would work because its on one line
//		List<MyDateEx> dates = Arrays.asList( 
//			    { new MyDateEx(2,1,2020), new MyDateEx(3,10,1980) } ); // ILLEGAL because its on 2 different lines
		
		//Anonymouse Array
		List<MyDateEx> dates4 = Arrays.asList( 
			    new MyDateEx[]{ new MyDateEx(2,1,2020), new MyDateEx(3,10,1980) } ); // LEGAL
	}
}
