package com.intertech.staticImportsPractice;
import static com.intertech.staticImportsPractice.SafeDriver.printMaxiumSpeed;
import static com.intertech.staticImportsPractice.SafeDriver.*;
public class Test {

	public static void main(String[] args) {
		
		StartVehicle lambdaMethod = ()-> System.out.println("Starting Car"); 
		
		// TODO Auto-generated method stub
		printMaxiumSpeed();
		
		lambdaMethod.startCar();
		
	}

}
