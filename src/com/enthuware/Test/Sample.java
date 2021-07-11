package com.enthuware.Test;

interface IInt {
	int theValue = 0;
}

public class Sample implements IInt {
	public static void main(String[] args) {
		Sample s = new Sample();
		int j = s.theValue;
		int k = IInt.theValue;
		int l = theValue;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
