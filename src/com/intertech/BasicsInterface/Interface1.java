package com.intertech.BasicsInterface;

public interface Interface1 {
	void abstractMethod();
	
	public default void defaultMethod() {
		System.out.println("defaultMethod in Interface1");
	}
	
	static void staticMethod() {
		System.out.println("StaticMethod in Interface1");
	}
}
