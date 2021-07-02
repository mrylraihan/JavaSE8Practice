package com.intertech.Basics;

public class BitwiseOperatorPractice2 {
	public boolean isSleeping() {
		System.out.println("isSleeping()");
		return false;
	}
	public boolean isHome() {
		System.out.println("isHome()");
		return true;
	}
	
	public void boolA() {
		if (isSleeping() & isHome()) {
			System.out.println("BoolA: shhh ... wallie is sleeping");
		}
	}
	public static void main(String[] args) {
		BitwiseOperatorPractice2 bt = new BitwiseOperatorPractice2();
		bt.boolA();
	}

}
