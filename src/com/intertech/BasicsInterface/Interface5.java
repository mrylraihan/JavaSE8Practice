package com.intertech.BasicsInterface;

public interface Interface5 extends Interface4 {
	void sayName();

	static void heythere() {
		System.out.println("hey there from interface 5");
	}

	default void sayhi() {

	}
}
