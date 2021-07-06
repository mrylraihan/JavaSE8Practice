package com.enthuware.Test5;

public class WorkingWithInheritance {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a=b;
//		b=a;this wont work because a is a parent it needs to be casted to b
		a = (B) b; 
		b = (B) a;
	}

}

class A{
	
}
class B extends A{
	
}
