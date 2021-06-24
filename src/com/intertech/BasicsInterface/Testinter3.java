package com.intertech.BasicsInterface;

public class Testinter3 implements Interface3{
	String name = "Wallie";
	String m = "M";
	public void testSayHi() {
		 sayHI(name);// doesnt have any access to any instance variables because we have not overridden the method
		 sayName();
	}
	
	public static void main(String[] args) {
		String name1 = "Heshow";
		Testinter3 t = new Testinter3();
		Interface3 three = new Testinter3();
		Interface3.sayVoid();
		t.testSayHi();
		t.sayHI(name1);
		three.sayHI(name1);
	}

}
