package com.newStuff.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram5 {
	
	public boolean isAnagram(String a, String b) {
		Map<Character, Integer> list1 = new HashMap<>();
		Map<Character, Integer> list2 = new HashMap<>();
		Character ch;
		
		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (list1.get(ch) == null) {
				list1.put(ch, 1);
			}else {
				list1.put(ch, (list1.get(ch) + 1));
			}
		}
		for (int i = 0; i < b.length(); i++) {
			ch = b.charAt(i);
			if (list2.get(ch) == null) {
				list2.put(ch, 1);
			}else {
				list2.put(ch, (list2.get(ch) + 1));
			}
		}
		
		return list1.equals(list2);
	}
	public static void main(String[] args) {
		Anagram4 an = new Anagram4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the First String: ");
		
		String word1 = sc.nextLine();
		System.out.println("Please enter the Second String: ");
		String word2 = sc.nextLine();
		
		an.isAnagram(word1, word2);
	}
}
