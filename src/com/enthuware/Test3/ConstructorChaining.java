package com.enthuware.Test3;

import java.io.OutputStreamWriter;

class A {
	int i;

	public A(int x) {
		this.i = x;
	}
	void print() {
		System.out.println("Hello come again!");
	}
}

public class ConstructorChaining extends A {

	int j;

	public ConstructorChaining(int x, int y) {
		super(x);
		this.j = y;
	}
	
//	public ConstructorChaining(int z){
//		this(z, z);// this is call constructor 1 in it own class 
//	}
	public ConstructorChaining(int y) {
		super(y*2);
		j= y;
	}
	void print() {
		super.print();
	}
	
	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining(3);
		c.print();
	}
	
	
}
