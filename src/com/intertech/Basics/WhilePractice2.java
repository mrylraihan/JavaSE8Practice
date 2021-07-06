package com.intertech.Basics;

import java.util.Scanner;

public class WhilePractice2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//allows user input number 
		int x = s.nextInt();// converts input into an int
		do {
			System.out.println("in do while: "+ ++x);
		}while(x<=20);
		
		while(0<=x) {
			System.out.println("in while: "+x);
			--x;
		}
	}
	
}
