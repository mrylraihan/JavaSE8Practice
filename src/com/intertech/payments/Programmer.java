package com.intertech.payments;

public class Programmer extends Employee {
//	private int lineOfCode = 1000;
//	private double payPerLineOfCode = 3.00;
	private double salary = 6000.00;
	

	public double pay() {
//		return (lineOfCode * payPerLineOfCode);
		return (salary/24);
	}
}
