package com.intertech.payments;

public class Manager extends Employee {
	private double salary = 7500.00;
	private double bonus = 10000.00;

	public double pay() {
		return (salary / 24) + (bonus / 24);
	}
}
