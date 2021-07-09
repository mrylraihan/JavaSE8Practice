package com.intertech.Basics2;

public class OverridingMethodChild extends OverridingMethodParent {
	// Overriding is changing the definition of a method a class inherits
	// -Overriding is done when a class inherits some functionality through a method
	// from an extended
	// class, but you want to change the functionality
	String name = "Child";

	public void whoAreYou() {
		System.out.println("im the Child in OverridingMethodChild class");
	}

	public void imthe() {
		System.out.println("im the " + name);
	}

	public void callingSuper() {
		super.imthe();
	}
	//can't override a static method so this is specific to the class 
	public static void sayHello() {
		System.out.println("in static method from Child");
	}

	public static void main(String[] args) {
		OverridingMethodChild oc = new OverridingMethodChild();
		OverridingMethodParent p = new OverridingMethodParent();
		OverridingMethodParent pc = new OverridingMethodChild();
		System.out.println("_________________> this is now from Child class only");
		oc.imthe();
		oc.callingSuper();
		oc.sayHello();
		System.out.println("_________________> this is now from parent class only");
		p.sayHello();// calling methods from the parent class non overridden
		p.whoAreYou();// calling methods from the parent class non overridden
		System.out.println("_________________> this is now from parent class made from an object of child");
		pc.sayHello();// calling the static method from parent because its of reference type parent
		pc.whoAreYou();// calling the overridden method from the child class because it is an object of the child
		System.out.println(oc.shortest);//accessing final variable in parent class
		
		

	}
}
//Note
// if the method names are the same, but the parameters are different, you are not overriding you are overloading the method
//Another Note
//An Overriding method cannot declare additional exceptions than those declared in the overridden method UNLESS
//the new exceptions are either a subtype of one of the overridden exceptions, or is a "runtime" exception
//you also can't override static or private method they can only be hidden