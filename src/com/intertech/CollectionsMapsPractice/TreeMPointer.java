package com.intertech.CollectionsMapsPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMPointer {
	public static void main(String[] args) {
		TreeMap<String, Integer> listNums = new TreeMap<String, Integer>();
		listNums.put("Hihsam", 915);
		listNums.put("Wayel", 919);
		listNums.put("Sam", 916);
		listNums.put("Korakot", 917);
		listNums.put("Garret", 918);
		listNums.put("wally", 1000);
		listNums.put("4",8);
		System.out.println(listNums);
		System.out.println(listNums.values());
		System.out.println(listNums.keySet());
		
		listNums.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("------------->");
		
		for(Map.Entry<String, Integer> contactElements : listNums.entrySet()) {
			System.out.println("In for-Each loop" + contactElements.getKey() + ": " + contactElements.getValue());
		}
		
		System.out.println("------------->");
		
	}

}
