package com.enthuware.Test;

public class Pointer {
	
	String s = this.toString();
	
	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = {'g','o','o','d'};
		
		String newStr = null;
		String oldStr= "";
		for(char ch : myCharArr) {
			
			oldStr = oldStr + ch;
			newStr = newStr + ch;
		}
		
		System.out.println(newStr +" "+myStr+" "+oldStr );
	
			
		int i; 
		int j;
		for(i=0, j=0;j<i;++j, i++) {
			System.out.println(i +" "+ j);
		}
		System.out.println(i + " " + j);
		
		String hello = "Hello", lo = "lo";
		System.out.println(hello == ("Hel"+lo).intern());
		
		String abc = "";
		abc = abc.concat("abc");
		abc = abc.concat("def");
		System.out.println(abc);
		
		
	}
}
