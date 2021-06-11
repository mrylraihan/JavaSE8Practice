package com.intertech.CollectsArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Pointer2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("e");
		list.add("f");
		
		Collections.sort(list);
		System.out.println(list);
		list.set(0, "A");
		System.out.println(list);
		
		ArrayList<String> listNames = new ArrayList<>();
		listNames.add("Barry Allen");
		listNames .add("Wally West");
		listNames.add("Jay Garrick");
		Collections.sort(listNames);
		int a = Collections.binarySearch(listNames, "Wally West");
		System.out.println(listNames);
		System.out.println(a);
		
	}

}
