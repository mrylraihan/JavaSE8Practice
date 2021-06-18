package com.intertech.InitializationBlockPractice;

public class Pointer2 {
	public Pointer2() {
		int w1 = sM(0);
	}
	
	static int w1 = sM(11);
	int w3 = sM(2);
	{
		w1 = sM(3);
	}
	static {
		w1 =sM(44);
	}
	static int w2 = sM(55);
	int w4 = sM(6);
	
	
	
	static int sM(int i) {
		System.out.print(i);
		return i;
	}
	public static void main(String[] args) {
		System.out.println(" In Main");
		Pointer2 wi = new Pointer2();
	}
}
