package com.intertech.CollectionsSetsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetPointere3 {
	
	public static void main(String[] args) {
		HashSet<Integer> numList = new HashSet<Integer>();
		numList.add(3);
		numList.add(1);
		numList.add(5);
		numList.add(2);
		numList.add(4);
		numList.add(5);
		System.out.println(numList);
		
		
		HashSet<String>h = new HashSet<String>();
		h.add("a");
		h.add("d");
		h.add("g");
		h.add("h");
		h.add("l");
		h.add("l");
		h.add("w");
		h.add("c");
		h.add("v"); // adding duplicate elements
		System.out.println(h);
		// or use iterator
				Iterator<Integer> i = numList.iterator();
				while (i.hasNext()) {
					System.out.println("Iterator: " + i.next());
				}
				
				
		//how to sort a HashSet
		List<String> list = new ArrayList<String>(h);
		Collections.sort(list);
		System.out.println("List H not sorted or converted "+h);
		System.out.println("List H sorted by cnverting it in too an arraylist "+ list);
		
		//sorting and converting our hashset
		List<Integer> list2 = new ArrayList<Integer>(numList);
		Collections.sort(list2);
		System.out.println("numList not sorted or converted, with numbers it will print in order sorting is not nessary"+numList);
		System.out.println("numList converted and sorted "+list2);
	}

}
