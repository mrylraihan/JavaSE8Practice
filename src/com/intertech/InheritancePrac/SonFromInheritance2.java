package com.intertech.InheritancePrac;

import com.intertech.InheritancePrac2.Parent1;

public class SonFromInheritance2 extends Parent1{
	public String childName = name;//name is from another package inheritanceprac2 from class parent1
	// we are putting in practice how protected access modifiers work
	//its only in the same class, package, and subclasses. so only this class can access those instance variables 
	// or methods, here we store that variable in a public one so we can use it in the main with out extending the main.
	
	public void sayname() {
		System.out.println(name);
	}
}
