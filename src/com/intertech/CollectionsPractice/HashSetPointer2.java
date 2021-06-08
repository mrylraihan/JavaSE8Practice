package com.intertech.CollectionsPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPointer2 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		// Adding elements into HashSet usind add()
		h.add("USA");
		h.add("India");
		h.add("Yemen");
		h.add("Yemen");
		h.add("Sudan");
		h.add("Australia");
		h.add("South Africa");
		h.add("India"); // adding duplicate elements

		// Displaying the HashSet
		System.out.println(h);

		System.out.println("List contains Palestine: " + h.contains("Palestine"));

		// Removing items from HashSet using remove()
		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);

		for (String country : h) {
			System.out.println("forEach Loop: " + country);
		}

		// or use iterator
		Iterator i = h.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
			;

		}

	}
}
