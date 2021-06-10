package com.intertech.CollectionsMapsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMPointer {
	public static void main(String[] args) {
		HashMap<String, Integer> hMaps = new HashMap<String, Integer>();
		hMaps.put("a", 1);
		hMaps.put("b", 2);
		hMaps.put("c", 3);
		System.out.println(hMaps);
		System.out.println("------------->");
		System.out.println(hMaps.get("a"));
		System.out.println("------------->");

		
		//Using for-Each loop for hashMaps
		for (Map.Entry<String, Integer> mapElement : hMaps.entrySet()) {
			String key = mapElement.getKey();
			int value = (int)mapElement.getValue();
			System.out.println(key+" , "+value);
		}
		
		System.out.println("------------->");
		//using an iterator
		//getting an iterator
		Iterator hMapsIterator = hMaps.entrySet().iterator();
		// Iterate through the hashmap with whileloop
		while (hMapsIterator.hasNext()) {
			Map.Entry<String, Integer> mapEntry = (Map.Entry<String, Integer>)hMapsIterator.next();
			int value = (int)mapEntry.getValue();
			System.out.println(mapEntry.getKey()+" ,"+value);
			
		}
		System.out.println("------------->");
		
		//forEach
		hMaps.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("------------->");
		System.out.println(hMaps.entrySet());
	}
}
