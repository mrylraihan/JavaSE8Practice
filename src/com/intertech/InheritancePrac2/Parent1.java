package com.intertech.InheritancePrac2;

public class Parent1 {
	public Parent1() {
		this("This in Noargs Constructor");
		System.out.println("no args constructor parent 1");
	}
	
	public Parent1(String n) {
		
		System.out.println("in one Parameter constructor "+n);
	}
}
