package com.newStuff.Practice;

import java.util.Arrays;

public class Anagram2 {
	public boolean annagram(String a, String b) {
		boolean answer = false;
		if (a == null || b != null && a.length() == b.length()) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] charList1 = a.toCharArray();
		char[] charList2 = b.toCharArray();

		Arrays.sort(charList1);
		Arrays.sort(charList2);
		String sortedWord1 = "";
		String sortedWord2 = "";
		for (char c : charList1) {
			sortedWord1 += c;
		}
		for (char c : charList2) {
			sortedWord2 += c;
		}

		
		if (sortedWord1.equals(sortedWord2)) {
			return answer = true;
		}
		return answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		String a = null;
		System.out.println(new Anagram2().annagram("Wayel", a ));
	}
}
