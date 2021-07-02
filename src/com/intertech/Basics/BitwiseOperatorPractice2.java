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
	
	public void ternaryOp() {
		String status = "";
		status = isSleeping() ? "Sleeping":"Working";
		System.out.println(status);
	}

	public void boolB() {
		int y;
		String x = null;
		if (x != null && x.trim().length() > 0) {
			System.out.println("this code passed");
			y = x.trim().length();
			System.out.println(y);
		} else {
			System.out.println("the short circuit worked");
			try {
				y = x.trim().length();
				System.out.println(y);
			} catch (NullPointerException e) {
				System.out.println("nullpointer exception bro ");
			}

		}
	}

	public static void main(String[] args) {
		BitwiseOperatorPractice2 bt = new BitwiseOperatorPractice2();
		bt.boolA();
		bt.boolB();
		bt.ternaryOp();
	}

}
