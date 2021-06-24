package com.enthuware.b;

import com.enthuware.a.A;

public class B extends A{
	B() {
		super();
	}

	public void print() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		new B();
	}
}
