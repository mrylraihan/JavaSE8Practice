package com.intertech.CollectionsSetsPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPointer2 {
	public static void main(String[] args) {
//		Another way to 
//		TreeSet<String> ts1 = new TreeSet<String>();
		Set<String> ts1 = new TreeSet<>();
//		Because they are all use the collections interface you can swap 
//		them out and all the methods will be used the same.
//		ArrayList<String> ts1 = new ArrayList();

		// Elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");

		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1);
	}
}
