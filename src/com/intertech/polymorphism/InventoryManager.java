package com.intertech.polymorphism;

public class InventoryManager {
	
	private Automobile featuredAuto;
	
	
	public void addFeaturedAuto(Automobile auto) {
		featuredAuto = auto;
	}
	
	
	public void addAutomobile(Automobile a) {
		System.out.println("Adding Automobile :# "+ a.getVIN());
	}
	
//	this is Method overloading 
//	public void addAutomobile(Car c) {
//		System.out.println("Adding Car :#"+ c.getVin());
//	}
//	public void addAutomobile(Truck t) {
//		System.out.println("Adding Truck:#"+ t.getVin());
//	}
//	public void addAutomobile(Motorcycle m) {
//		System.out.println("Adding Motorcycle:#"+ m.getVin());
//	}
//	public void addAutomobile(Bus b) {
//		System.out.println("Adding Bus:#"+ b.getVin());
//	}
//	public void addAutomobile(Mopeg mp) {
//		System.out.println("Adding Mopeg:#"+ mp.getVin());
//	}

}
