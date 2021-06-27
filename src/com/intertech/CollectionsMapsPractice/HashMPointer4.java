package com.intertech.CollectionsMapsPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMPointer4 {
	public static void main(String[] args) {
		HashMap<String, Integer > bMaps = new HashMap<>();
		bMaps.put("a",0);
		bMaps.put("b", 1);
		bMaps.put("c",2);
		
		System.out.println(bMaps);
		
		bMaps.forEach((k,v)->System.out.println(k+ " , "+ v));//with a lambda function
		
		for ( Map.Entry<String, Integer> mapElement : bMaps.entrySet()) {
			String key = mapElement.getKey();
			int value = (int)mapElement.getValue();
			System.out.println(key+" , "+value);
		}
	}

}
