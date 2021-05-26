package com.intertech.lambdaPractice2;

public interface GreetInterface {
	void Greetings();
	default void Bye() {
		
	};
	static void ByeAgain() {
		
	}
	
	String toString();

}
