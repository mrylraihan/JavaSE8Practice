package com.intertech.CollectionsCompares;

public class Laptop implements Comparable<Laptop> {
	private String brand;
	private String operatingSystem;
	private int ram;
	private int price;

	public Laptop(String brand, String operatingSystem, int ram, int price) {
		super();
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", operatingSystem=" + operatingSystem + ", ram=" + ram + ", price=" + price
				+ "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {
		// this > o = +
		// this < o = -
		// this == o = 0
		if (this.getPrice() > o.getPrice()) {
			return 1;
		}
		if (this.getPrice() < o.getPrice()) {
			return -1;
		}
		if (this.getPrice() == o.getPrice()) {
			return 0;
		}
		return price;

	}

}
