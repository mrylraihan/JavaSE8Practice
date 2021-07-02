package com.intertech.Basics;

public class WhilePractice {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while( x <= 20 ) {
			if (x % 2 == 0) {
				System.out.println(x+" is divisible by 2");
			}else {
				System.out.println(x);	
			}
			++x;
		}
		
		System.out.println("----------------------------------------->"+ x);
	
	do {
		System.out.println(x);
		x--;
	}while(x>=0);
	
	
	
	
	
	
	
	}
}
