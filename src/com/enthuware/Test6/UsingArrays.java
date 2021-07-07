package com.enthuware.Test6;

class A {
}

class B extends A {
}

public class UsingArrays {
	//27 test 5
	public static void main(String[] args) {
		A[] a, a1;
		B[] b;
		a = new A[10];
		a1 = a;
		b = new B[20];
		a = b; // 1
		a1 = b;// this line isnt here so it will cause a classcast exception on line //3 
		b = (B[]) a; // 2
		b = (B[]) a1; // 3 }
	}
}
