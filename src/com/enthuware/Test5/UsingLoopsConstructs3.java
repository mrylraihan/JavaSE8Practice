package com.enthuware.Test5;

public class UsingLoopsConstructs3 {
	public static void main(String[] args) {
		boolean b = false;
		int i = 1;
		do {
			i++;//2
		}while(b = !b);//false = false
		System.out.println(i);
		System.out.println(b);
		
		
	}
}

