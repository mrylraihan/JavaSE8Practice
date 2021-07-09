package com.intertech.InheritancePrac2;

public class Parent1 {
	protected String name = "Protected Wallie";// this is being used in the inheritanceprac package
	//by SonfromInheritance2 to put in practice protected modifiers
	
	public Parent1() {
		this("This in Noargs Constructor");
		System.out.println("no args constructor parent 1");
	}
	
	public Parent1(String n) {
		
		System.out.println("in one Parameter constructor "+n);
	}
}
