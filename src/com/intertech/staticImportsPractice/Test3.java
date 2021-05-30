package com.intertech.staticImportsPractice;
import static com.intertech.staticImportsPractice.SafeDriver.*;
public class Test3 {
	public static void main(String[] args) {
		int howFast = MAXIUM_SPEED;
		int follingOtherCars = SAFE_FOLLOWING_DISTANCE;
		double fastestSpeed = MAXIUM_SPEED;
		printMaxiumSpeed();
		System.out.println(howFast);
		System.out.println(follingOtherCars);
		System.out.println(fastestSpeed);
		
	}

}
