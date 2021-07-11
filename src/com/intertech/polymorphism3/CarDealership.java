package com.intertech.polymorphism3;

public class CarDealership {
	private static InventoryManager manager = new InventoryManager();
	public static void main(String[] args) {
		
		Car c = new Car();
		manager.addAutomobile(c);
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Motorcycle m = new Motorcycle();
		manager.addAutomobile(m);
		
		Scooter s = new Scooter();
		manager.addAutomobile(s);
		
		Automobile a = new Automobile();//object and reference type is Automobile
		Automobile ac = new Car();//object of car reference type is Parent Car
		System.out.println(a instanceof Automobile);//true
		System.out.println(a instanceof Car);//false
		System.out.println(ac instanceof Automobile);//true
		System.out.println(ac instanceof Car);//true
	}

}
