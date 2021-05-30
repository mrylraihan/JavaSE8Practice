package com.intertech.staticImportsPractice;

public interface SafeDriver {
	public static final int MAXIUM_SPEED = 55;
	public static final int SAFE_FOLLOWING_DISTANCE = 100;
	public static final double MINIMUM_FUEL_LEVEL = 55;
	public static void printMaxiumSpeed() {
		System.out.println(MAXIUM_SPEED);
	}
	void drive();
	void stop();

}
