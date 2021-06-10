package com.intertech.CollectionsExtras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class AutoBoxingPointer {
	public static void main(String[] args) {
		//Autoboxing is wrappping the ints with integers
		List list = new ArrayList();
		int j = 7;
		int y = 8;
		list.add(j);
		list.add(y);
		System.out.println(list);
		list.forEach(a->System.out.println(a));
		System.out.println("------------------>");
		
		HashSet<Character> charList = new HashSet();
		charList.add('A');
		charList.add('B');
		charList.add('C');
		System.out.println(charList);
		System.out.println("------------------>");
		
		HashMap<Character, Double> charNumList = new HashMap();
		charNumList.put('s', 4.00);
		charNumList.put('a',10.00);
		charNumList.put('y', 90.00);
		System.out.println(charNumList);
		charNumList.forEach((k,v)->System.out.println(k+":"+v));
		TreeMap<Character,Double> charNumList2 = new TreeMap();
		charNumList2.put('s', 4.00);
		charNumList2.put('a',10.00);
		charNumList2.put('y', 90.00);
		System.out.println(charNumList2);
		charNumList2.forEach((k,v)->System.out.println(k+":"+v));
	}
}
