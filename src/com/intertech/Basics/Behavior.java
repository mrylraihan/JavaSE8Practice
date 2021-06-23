package com.intertech.Basics;

public interface Behavior extends WorkBehavior{
	void doingStuff();
	
	public default void sayHi() {
		System.out.println("Hi");
	}
}
