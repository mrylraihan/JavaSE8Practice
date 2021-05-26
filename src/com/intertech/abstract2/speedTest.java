package com.intertech.abstract2;

public class speedTest {

	public static double speedDifference(Car s1, Car s2) {
	return s1.topSpeed() - s2.topSpeed();
}
	public static void startingBuild(motor m) {
		m.building();
		m.buildMotor();
		m.startmotor();

	}


}
