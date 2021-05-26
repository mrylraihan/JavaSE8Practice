package com.acme.domain;

public class Service implements Product{
	private String name;
	private int estimatedTeskDuration;
	private boolean timeAndMaterials;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEstimatedTeskDuration() {
		return estimatedTeskDuration;
	}

	public void setEstimatedTeskDuration(int estimatedTeskDuration) {
		this.estimatedTeskDuration = estimatedTeskDuration;
	}

	public boolean isTimeAndMaterials() {
		return timeAndMaterials;
	}

	public void setTimeAndMaterials(boolean timeAndMaterials) {
		this.timeAndMaterials = timeAndMaterials;
	}

	public Service(String n, int dur, boolean tAndM) {
		super();
		this.name = n;
		this.estimatedTeskDuration = dur;
		this.timeAndMaterials = tAndM;
	}
	
	public String toString() {
		return name +"(a"+estimatedTeskDuration+ "day service)";
	}

}
