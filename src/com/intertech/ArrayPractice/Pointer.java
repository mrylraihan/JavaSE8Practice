package com.intertech.ArrayPractice;

import java.util.Iterator;

public class Pointer {
	
	public static int indexOfName(String name, String...names) {
		for(int i = 0; i<names.length; i++) {
			if(names[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String[] nameList = {"Mike", "Moe", "Wallie","Kay","Shawn"};
		
		System.out.println(indexOfName("wayel", nameList));
		System.out.println("------------------------->");
		System.out.println(indexOfName("Wallie",nameList));
		
	}

}
