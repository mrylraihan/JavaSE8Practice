package com.intertech.lambdaPractice5;

import java.util.function.Predicate;

public class Pointer implements Predicate<String>{
	
	public void turnOff(PowerOff powerOff) {
		powerOff.turnOffComputer();
	}
	
	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		Pointer point = new Pointer();
		
		PowerOn pressButton = ()-> System.out.println("Powering on Pc");
		
		pressButton.turnOnComputer();
		point.turnOff(()-> System.out.println("Powering Off Pc"));
		
		Predicate<String> predicate = new Pointer();
		predicate = (String t)-> t.equalsIgnoreCase("Wallie")? true: false;
		
		boolean test1 = predicate.test("Hisham");
		boolean test2 = predicate.test("wallie");
		System.out.println(test1);
		System.out.println(test2);
		
	}



	
	
	

}
