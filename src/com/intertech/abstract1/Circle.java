package com.intertech.abstract1;

public class Circle extends Shape{
	
	public double r;

	@Override
	public double area() {
		return Math.PI * r * r;
	}

	@Override
	public void draw() {
		System.out.println("ima circle");
		
	}

}
