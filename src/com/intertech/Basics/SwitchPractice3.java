package com.intertech.Basics;

public class SwitchPractice3 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "red";
		car1.type = "modelY";
		Car car2 = new Car();
		car2.color = "blue";
		car2.type = "model3";
		Car car3 = new Car();
		car3.color = "green";
		car3.type = "modelS";
		Car car4 = new Car();
		car4.color = "black";
		car4.type = "modelX";
		
		System.out.println(car4.toString());
		
		switch(car3.color) {
		case "red":
			System.out.println("this "+car3.type+" car is red");
			break;
		case "blue":
			System.out.println("this "+car3.type+" car is blue");
			break;
		case "green":
			System.out.println("this "+car3.type+" car is green");
			break;
		case "black":
			System.out.println("this "+car3.type+" car is black");
			break;
		default:
			System.out.println("we are in default we just know its a tesla");
			break;
		}
		
	}

}
