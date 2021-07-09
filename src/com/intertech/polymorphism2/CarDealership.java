package com.intertech.polymorphism2;

public class CarDealership {
	private static InventoryManager manager = new InventoryManager();
	
	public static void main(String[] args) {
		Automobile a = new Car();
	
		Car c  = new Car();
		manager.addAutomobile(c);
		manager.addFeaturedAuto(c);
		
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Motorcycle m = new Motorcycle();
		manager.addAutomobile(m);
		
		Bus b = new Bus();
		manager.addAutomobile(b);
		
		Mopeg mp = new Mopeg();
		manager.addAutomobile(mp);
	}

}