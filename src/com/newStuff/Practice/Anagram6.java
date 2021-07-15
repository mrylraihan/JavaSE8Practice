package com.newStuff.Practice;

import java.util.Arrays;

public class Anagram6 {
	//eat and ate
	public boolean annagramTest(String a, String b) {
		boolean answer;
		a= a.replace(" ", "").toLowerCase();
		b= b.replace(" ", "").toLowerCase();
		
		char[] word1 = a.toCharArray();
		char[] word2 = b.toCharArray();
		
		String sortedWord1 = new String(word1);
		String sortedWord2 = new String(word2);
		
		answer = sortedWord1.equals(sortedWord2);
		System.out.println(sortedWord1 +" "+ sortedWord2);
		
//		Arrays.sort(word1);
//		Arrays.sort(word2);
//		answer = Arrays.equals(word1, word2);
		return answer;
	}
	
	public static void main(String[] args) {
		String test1 = "Eat";
		String test2 = "a Te";
		String test3 = "e Eat";
		String test4 = " eA t";
		
		Anagram6 a6 = new Anagram6();
		
		if (a6.annagramTest(test1, test4)) {
			System.out.println("your test is successful they are Annagrams");
		}else {
			System.out.println("sorry "+ test1+" and "+ test4+" arent annagrams");
		}
	}

}
