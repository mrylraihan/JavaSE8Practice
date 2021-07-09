package com.intertech.InheritancePrac2;

public class Pointer1 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println("------>");
		Child1 b = new Child1("Wallie");
		System.out.println(b.name);
	}
}
