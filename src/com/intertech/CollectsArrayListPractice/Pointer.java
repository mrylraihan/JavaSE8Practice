package com.intertech.CollectsArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Pointer {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("World");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Wayel");
		list2.add("Raihan");
		
		ArrayList list3 = new ArrayList();
		list3.add("Bruce Wayne");
		list3.add("Clark kent");
		list3.add("Hal Jordan");
		System.out.println(list3);
		System.out.println(list3.size());
		list3.remove(0);
		System.out.println(list3);
		System.out.println(list3.size());
		
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(2);
		list4.add(3);
		list4.add(4);
		System.out.println(list4);
		//the same way we use Arrays.utils for Arrays, we use Collections for Arraylist
		Collections.sort(list4);
		System.out.println(list4);
		
		ArrayList list5 = new ArrayList(3);
		list5.add("c");
		list5.add("a");
		list5.add("b");
		list5.add("d");
		list5.add("e");
		list5.add("f");
//		list5.add(5); These two will be stored in the Arraylist but you wont be able to sort this array
//		list5.add(false);
		System.out.println(list5);
		Collections.sort(list5);
		System.out.println(list5);
		list5.remove(0);
		list5.remove("b");
		System.out.println(list5);
		System.out.println(list5.contains("e"));
		if(list5.contains("a")) {
			System.out.println("a is here in list5");
		}else {
			System.out.println("we dont have an a in list5");
		}
		list5.clear();
		list5.add("W");
		System.out.println(list5.isEmpty());
		
		
	}

}
