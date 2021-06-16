package com.intertech.CollectionsCompares;

import java.util.Comparator;

public class Dogs implements Comparable<Dogs>{
	private String name, breed;
	private int age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dogs(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dogs [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Dogs o) {
		return this.getBreed().compareTo(o.getBreed());
		
	}


}
