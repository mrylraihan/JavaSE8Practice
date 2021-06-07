package com.intertech.ArrayListPractice1;

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
		
	}

}
