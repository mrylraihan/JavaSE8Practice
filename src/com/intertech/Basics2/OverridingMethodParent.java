package com.intertech.Basics2;

public class OverridingMethodParent {
	public final int shortest;// final variables need to be initialized either in line or the only other place
								// is the
	// constructor, other wise there will be a compilation error. the variable can
	// be accessible before its been initialized
	String name = "Parent";

	public void whoAreYou() {
		System.out.println("im the parent in OverridingMethodParent class");
	}

	public void imthe() {
		System.out.println("im the " + name);
	}

	public static void sayHello() {
		System.out.println("in static method from Parent");
	}

	public OverridingMethodParent() {
		this.shortest = 1;

	}
	public static String firstname;// both initialized to null
	public String lastName;

	public static void main(String[] args) {
		OverridingMethodParent ov = new OverridingMethodParent();
		OverridingMethodParent ov1 = new OverridingMethodParent();
		ov.imthe();
		OverridingMethodParent.sayHello();
		// or these are the two ways to call static methods it preferred to call directly from the class
		ov.sayHello();
		System.out.println(ov.shortest);
		System.out.println(ov1.shortest);
		System.out.println(OverridingMethodParent.firstname);
		System.out.println(ov.lastName);

	}
}
