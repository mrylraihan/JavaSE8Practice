package com.intertech.CollectsArrayListPractice;

import java.util.ArrayList;

public class EqualsPointer {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		System.out.println(list1.equals(list2));
		list1.add("a");
		System.out.println(list1.equals(list2));
		list2.add("a");
		System.out.println(list1.equals(list2));
		list1.add("b");
		list2.add(0, "b");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.equals(list2));
		
		
	}

}
