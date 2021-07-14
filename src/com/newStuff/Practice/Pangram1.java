package com.newStuff.Practice;

public class Pangram1 {

	public boolean pannagram(String a) {
		boolean answer = true;
		int index = 0;
		boolean[] mark = new boolean[26];
		a = a.replace(" ", "").toLowerCase();
		for (int i = 0; i < a.length(); i++) {
			char cur = a.charAt(i);

			if (cur >= 'a' && cur <= 'z') {
				index = cur - 'a';
			}
			
			mark[index] = true;
		}
		for (int i = 0; i < mark.length; i++) {
//			System.out.println(mark[i]+" "+ i);
			if (mark[i] == false) {
				answer = false;
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		Pangram1 p = new Pangram1();
		String words = "The Quick Brown Fox Jumps Over the lazy Dog";

		System.out.println(p.pannagram(words));
	}

}
