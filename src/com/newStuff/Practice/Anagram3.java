package com.newStuff.Practice;

import java.util.Arrays;

public class Anagram3 {

	public boolean annagram (String a, String b) {
		boolean answer;
		a = a.replace(" ", "").toLowerCase();
		b = b.replace(" ", "").toLowerCase();
		
		char[] charlist1 = a.toCharArray();
		char[] charlist2 = b.toCharArray();
		
		Arrays.sort(charlist1);
		Arrays.sort(charlist2);
		answer = Arrays.equals(charlist1, charlist2);
		if (answer == true) {
			System.out.println("the Strings are annagrams");
		}else {
			System.out.println("the Strings arent annagrams");
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Anagram3 t3 = new Anagram3();
		t3.annagram("Wayel", "wa   yel");
	}
}
