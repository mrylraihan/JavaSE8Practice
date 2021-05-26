package com.intertech.abstract2;

public class Bmw extends Car {
	private double speed;
	private String name;
	
	public Bmw(double speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double topSpeed() {
		return speed * 2.0;
	}
	
	@Override
	public void buildMotor() {
		System.out.println("building motor for " + name);
	};

	public void building() {
		System.out.println("building for parts for " + name);

	}

	@Override
	public void startmotor() {
		System.out.println("starting motor "+ name);
		
	}
	

	

}
