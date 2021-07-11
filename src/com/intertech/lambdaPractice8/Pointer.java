package com.intertech.lambdaPractice8;

public class Pointer {
	public static void main(String[] args) {
		String name = "Wallie";
		
		Functional1 hi = ()->System.out.println("hi");
		hi.saySomething();
		
		Functional2 retur = ()->{return name;};
		System.out.println(retur.giveMeString());
	}
}
