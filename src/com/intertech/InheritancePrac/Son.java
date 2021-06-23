package com.intertech.InheritancePrac;

public class Son extends Father{
	public static void sayHello() {
		System.out.println("STATIC: HEllo from Son");
	}
	public void sayHi() {
		System.out.println("INSTANCE: hi from Son");
	}
	public void drive() {
		System.out.println("Driving.....Son");
	}
	
	public void walk() {
		System.out.println("im walking in Son");
	}
	public void driveLikeDad() {
		super.drive();
	}
}
