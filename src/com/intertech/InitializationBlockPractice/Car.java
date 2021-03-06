package com.intertech.InitializationBlockPractice;
//import com.labPractice.MyDate;

public class Car {
	String color;
	String type;
	int serialNumber;
	static int carCount;
	

	{
		color = "red";
		type = "Celica";
	}

	Car() {
		carCount++;
		serialNumber = carCount;
		System.out.println("There is " + carCount + " cars on the lot");
	}

	Car(String color, String type) {
		this();
		this.color = color;
		this.type = type;
	}

	// desc = this is a blue convertible Celica
	String getDescription() {
		String desc = "This is a " + color + " " + type;
		return desc;
	}

	// Customize frame : newColor = blue newType = convertible
	void customize(String color, String type) {
		// this will assign to object

		this.color = color;
		this.type = type + " " + this.type;
		System.out.println(getDescription());
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.customize("blue", "convertabile");
		Car herCar = new Car();
		herCar.customize("yellow", "Bettle");
		Car myCar1 = new Car();
		System.out.println(myCar1.getDescription());
		System.out.println(Car.carCount);
		System.out.println(myCar.carCount);//not recommended because carCount is a class 
		//variable meaning its a static variable
		

		// MyDate myDate;
		// System.out.println(myCar.getDescription());
	}

}
