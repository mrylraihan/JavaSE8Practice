package com.intertech.examples;

 class Father { 
	public static void sayHello() {
		System.out.println("STATIC: Hello from Father");
	}
	
	public void sayHi() {
		System.out.println("INSTANCE: Hi from father");
	}
	public void running() {
		System.out.println("Running in Father");
	}
	
	void drive() {
		System.out.println("Driving....father");
	}
}

