package com.intertech.polymorphism3;

public class Automobile {
	private static int vinCount = 3_818_202;
	private int VIN;

	public Automobile() {
		VIN = vinCount++;
	}

	public int getVIN() {
		return VIN;
	}
}
