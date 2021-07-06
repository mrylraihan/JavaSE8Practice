package com.intertech.Basics;

public class BreakAndCont {
	public static void main(String[] args) {

		for (int j = 0; j < 10; j++) {
			if (j == 8) {
				break;
			}
			System.out.println("j: "+j);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 8) {
				continue;
			}
			System.out.println("i: "+i);
		}
	}

}
