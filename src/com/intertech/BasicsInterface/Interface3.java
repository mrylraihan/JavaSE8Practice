package com.intertech.BasicsInterface;

public interface Interface3 {
	String m = "Mike";
	public default void sayHI(String n) {
		System.out.println("Haying Hi from the default method in interface3 " + n);
	}
	public default void sayName() {
		System.out.println("Hey this is an instance member of the interface3 "+ m);
	}
	
	public static void sayVoid() {
		System.out.println("static from interface3");
	}
}
