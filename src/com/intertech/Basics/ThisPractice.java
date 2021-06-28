package com.intertech.Basics;

public class ThisPractice {
	String color;
	String vehicle;
	int serialNumber;
	static int carCount;
	
	{
		color = "red";
		vehicle ="Motor Cycle";
	}
	
	public String getDescription() {
		String desc = " i have a " + this.color + " "+ this.vehicle;
		return desc;
	}
	public ThisPractice(String color, String vehicle) {
		
		this();// how we call another constructor in the same class,
		//if the constructor had parameters we would add those, 
		//when chaining constructors together it must be the first line
		this.color = color;
		this.vehicle = vehicle;
		System.out.println(getDescription());
	}
	public ThisPractice() {
		carCount++;
		serialNumber = carCount;
	}
	void customize(String color, String vehicle) {
		this.color = color;
		this.vehicle = vehicle;
		System.out.println(getDescription());
	}
	public static void main(String[] args) {
		//Constructor with parameters
		ThisPractice tp = new ThisPractice("Blue", "Car");
		System.out.println("Not in Constructor "+tp.getDescription());
		tp.customize("Green", "Van");
		
		ThisPractice tp1 = new ThisPractice();
		System.out.println(tp1.getDescription());
		ThisPractice tp2 = new ThisPractice();
		System.out.println(carCount);
	}
}
