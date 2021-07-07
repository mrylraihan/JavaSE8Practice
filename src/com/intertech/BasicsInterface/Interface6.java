package com.intertech.BasicsInterface;

public interface Interface6 {
	String stuff = "stuff from interface 6";
	static void heythere() {
		System.out.println("hey there from interface 6");
	}
	
	default void defaultM() {
		System.out.println("using default method in interface 6");
	}


}
