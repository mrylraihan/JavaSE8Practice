package com.intertech.BasicsInterface;

public interface MethodSignatureInterface {
	//abstract
//	public abstract void compute();
	void compute();
	//static
	static void compute1() {
		System.out.println("we are in static compute");
	}
	//default
	default void compute2() {
		System.out.println("we are in default compute");
	}
}
