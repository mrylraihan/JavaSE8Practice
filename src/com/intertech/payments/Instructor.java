package com.intertech.payments;

public class Instructor extends Employee{
private double payPerClass = 1000.00;
private int classes = 2;
public double pay() {
	return (payPerClass * classes);
}
}
