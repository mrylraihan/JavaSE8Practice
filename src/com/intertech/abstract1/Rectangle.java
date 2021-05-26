package com.intertech.abstract1;

public class Rectangle extends Shape implements Drawable{
public double h, w;
	@Override
	public double area() {
		
		return h * w;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}
	public void testBehavior() {
		sayHi();
	}
	
}
