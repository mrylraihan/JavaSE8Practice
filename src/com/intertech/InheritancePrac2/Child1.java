package com.intertech.InheritancePrac2;

public class Child1 extends Parent1{
	
	public Child1(String n) {
		super(n);
		System.out.println("in child one paramter constructor "+ n);
	}
	
	public Child1() {
		this("this in child no args constructor");
		System.out.println("child no args constructor");
	}

}
