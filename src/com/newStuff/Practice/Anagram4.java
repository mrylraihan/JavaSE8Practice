package com.newStuff.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram4 {
	
	public boolean isAnagram(String a, String b) {
		boolean answer;
		a =  a.replace(" ", "").toLowerCase();
		b =  b.replace(" ", "").toLowerCase();
		
		char[] list1 = a.toCharArray();
		char[] list2 = b.toCharArray();
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		if (Arrays.equals(list1,list2)) {
			answer = true;
			System.out.println("these two strings "+ a +" and "+ b + " are annagrams");
		}else {
			answer = false;
			System.out.println("these two strings "+ a +" and "+ b + " are Not annagrams");
		}
		
		return answer;
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
