package com.intertech.ExceptionsPractice;

import java.util.Iterator;

public class Pointer8 {
	public static void main(String[] args) {
		int[]numer = {4,8,16,32};
		int[]denom = {2,4,0,4};
		
		for(int i = 0; i < numer.length;i++) {
			try {
				System.out.println(numer[i]/denom[i]);
			} catch (ArithmeticException e) {
				System.out.println("you divided  something by 0");
			}
		}
	}
}
