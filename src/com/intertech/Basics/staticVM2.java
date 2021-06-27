package com.intertech.Basics;

public class staticVM2 {
	static String ss;
	static String resetS(String a) {
		a = "s";
		System.out.println("s now equals "+a+" due to our static method ");
		return a;
	}
	public static void main(String[] args) {
		String s = null;
		try {
			s = resetS(s);
			s = s.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("you in a null pointer exception bro");
		}
		try {
			ss.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("you in a null pointer exception again bro");
		}
		System.out.println("s : "+s);
		
		System.out.println("ss :"+ss);
		
	}

}
