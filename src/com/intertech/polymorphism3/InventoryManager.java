package com.intertech.polymorphism3;

public class InventoryManager {
//	public void addAutomobile(Car c) {
//		System.out.println("Adding Car # "+c.getVIN());
//	}
//	public void addAutomobile(Truck t) {
//		System.out.println("Adding Truck # "+t.getVIN());
//	}

//	public void addAutomobile(Motorcycle m) {
//		System.out.println("Adding Motorcycle # "+ m.getVIN());
//	}
	
	
//	The java instanceof operator is used to test whether the object is 
//	an instance of the specified type (class or subclass or interface).
	public void addAutomobile(Automobile a) {;
		if (a instanceof Car) {
			System.out.println("Adding Car # "+a.getVIN());
		}else if (a instanceof Truck) {
			System.out.println("Adding Truck # "+a.getVIN());
		}else if (a instanceof Motorcycle) {
			System.out.println("Adding Motorcycle # "+a.getVIN());
		}else if (a instanceof Scooter) {
			System.out.println("Adding Scooter # "+a.getVIN());
		}else if (a instanceof Automobile) {
			System.out.println("Adding Autombile #"+a.getVIN());
		}
	}

}
