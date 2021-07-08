package com.enthuware.Test6;

class X {
	public X() {
		System.out.println("In X");
	}
}

class Y extends X {
	public Y() {
		super();
		System.out.println("In Y");
	}
}

class Z extends Y {
	public Z() {
		System.out.println("In Z");
	}
}

public class ConstructorsP {

	public static void main(String[] args) {
		Y y = new Z();

		System.out.println("=========>");

		Z z = new Z();

		System.out.println("=========>");

		X x = new Z();

		Boolean.parseBoolean("true");

		Boolean by = Boolean.valueOf(true);
		Boolean bi = Boolean.valueOf("trUe");
		System.out.println(Boolean.TRUE);
		System.out.println(by);
		System.out.println(bi);
		
		if (8 == 81) {
			
		}
	}
}