package com.intertech.Basics;

public interface WorkBehavior{
 void tellUsYourJob();
 
 public default void sayHi() {
		System.out.println("Hi");
	}
 public default void sayBye() {
	 System.out.println("Bye");
 }
}
