package com.newStuff.Practice;

import java.util.Arrays;

public class Anagram8 {
	
	public boolean annaGram(String a, String b) {
		boolean answer = false;
		a = a.replace(" ", "").toLowerCase();
		b = b.replace(" ", "").toLowerCase();
		
		char[] alist = a.toCharArray();
		char[] blist = b.toCharArray();
		Arrays.sort(alist);
		Arrays.sort(blist);
		answer = Arrays.equals(alist, blist);
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		String word1 = "SH Ajna";
		String word2 = "s hajan";
		Anagram8 a8 = new Anagram8();
		
		if (a8.annaGram(word1, word2) == false ) {
			System.out.println("sorry these strings arent annagrams");
		}else {
			System.out.println("yes these two Strings "+word1+" & "+word2+" are annagrams" );
	
		}
	}

}
