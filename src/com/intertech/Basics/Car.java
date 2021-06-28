package com.intertech.Basics;

public class Car {
	//object Creatation basics 
	String color;
	String type;
	
	void startCar() {
		System.out.println("starting you car :"+ this.type);
	}
	String printDescription() {
		String desc = "this is a "+ color + " and type :" + type;
		return desc;
	}
	
	void Car(String color, String type ){// this isnt a constructor this is a regular method
		//Constructors dont have a return type
		System.out.println("this is a "+color +" "+ type);
	}
	

}

