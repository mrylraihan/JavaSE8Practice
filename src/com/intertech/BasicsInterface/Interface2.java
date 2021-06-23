package com.intertech.BasicsInterface;

public interface Interface2 extends Interface1 {
	void abstractMethod();
	
	public default void defaultMethod() {
		System.out.println("defaultMethod in Interface2");
	}
}
