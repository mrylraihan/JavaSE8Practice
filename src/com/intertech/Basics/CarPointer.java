package com.intertech.Basics;

public class CarPointer {
	static char a;//Legal - defaults to blank character
	static String name;//Legal - defaults to null
	//instance variables and static variables have a default value of null;
	//and can be used in methods they will just return null
	
	
//	Default values for each type;
//	Any object (Strings as well): null
//	boolean : false
//	byte, short, int, long : 0
//	float or double : 0.0
//	char : \u0000 or NUL/blank Character
	

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.type = "Tesla";
		myCar.startCar();
		System.out.println(myCar.printDescription());
		// or
		String desc = myCar.printDescription();
		System.out.println(desc);

		Car myCar2 = new Car();

		System.out.println(myCar2.printDescription());
		myCar2.startCar();
//		String name1;//Illegal - wont default to null because it is in a method
//		System.out.println(name1);// this will error because the variable was'nt initialized 
//		unlike Static and instance variables, variables in a method must be initialized before they are used
		System.out.println(name);
		System.out.println(a);
	}
}
