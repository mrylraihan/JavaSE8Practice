package com.intertech.Basics;

public class SVM2Pointer {
	public static void main(String[] args) {
		String s = null;
		try {
			s = staticVM2.resetS(s);
			s = s.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("you in a null pointer exception bro");
		}
		try {
			staticVM2.ss.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("you in a null pointer exception again bro");
		}
		System.out.println("s : "+s);
		
		System.out.println("ss :"+staticVM2.ss);
		
	}
}
