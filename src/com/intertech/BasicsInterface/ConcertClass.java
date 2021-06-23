package com.intertech.BasicsInterface;

public class ConcertClass extends AbstractPointer{

	@Override
	public void abstractMethod() {
		System.out.println("Abstract method that needs to be overridden from our interface1");
		
	}
	@Override
	public void astractMInAbstrctClass() {
	System.out.println("abstract method in our abstract class that need to be overridden");
		
	}
	public static void main(String[] args) {
		ConcertClass class1 = new ConcertClass();
		class1.defaultMethod();
		class1.abstractMethod();
		class1.astractMInAbstrctClass();
		Interface1.staticMethod();
		Interface1 class2 = new ConcertClass();
		class2.defaultMethod();
	}
	

}
