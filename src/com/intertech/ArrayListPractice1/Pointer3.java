package com.intertech.ArrayListPractice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pointer3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bruce Wayne");
		list.add("Clark kent");
		list.add("Hal Jordan");
		list.add("Bruce Banner");
		list.add(0 , "Berry Allen");
		list.add(3, "Flash Gordan");
		
		System.out.println(list);
		list.set(0, "Peter Parker");
		list.set(1, "Dick Grayson");
		list.set(2, "Micheal Jordan");
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(1));
		
		
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();
	}
}