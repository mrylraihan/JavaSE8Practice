package com.intertech.abstract1;

public interface Drawable {
	public abstract void draw();
	
	public default void sayHi() {
		System.out.println("Hello");
	}
	
	public static void sayBye() {
		System.out.println("Bye");
	}
	

}
