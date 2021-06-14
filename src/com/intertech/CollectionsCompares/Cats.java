package com.intertech.CollectionsCompares;

public class Cats implements Comparable<Cats>{
	private String name, color;
	private int age;
	
	public Cats(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cats [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Cats o) {
		Cats c = (Cats) o;
		return this.getName().compareTo(c.getName());
			
	}
	
	

}
