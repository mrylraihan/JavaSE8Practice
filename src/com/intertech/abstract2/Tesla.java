package com.intertech.abstract2;

public class Tesla extends Car{
	private double speed;
	private String name;
	
	
	
	public Tesla(double speed, String name) {
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
		System.out.println("building electric motor for " + name);
	};
	@Override
	public void building() {
		System.out.println("building for parts for electric vehicle " + name);

	}

	@Override
	public void startmotor() {
		System.out.println("starting motor electric "+ name);		
	}
	
	
	

}
