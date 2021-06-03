package com.intertech.ArrayPractice2;

public class Manager extends Employee {
	public String department;

	public String toString() {
		return super.toString() + "Manages: " + department;
	}
}
