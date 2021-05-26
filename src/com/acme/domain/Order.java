package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {

	// instance variables
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	private Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	int quantity;
	public static double taxRate = 0.05;

	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;

	}

	public Order(MyDate d, double amt, String c, Product s3, int q) {
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = s3;
		quantity = q;
	}

	public String toString() {
		return quantity + " ea. " + product + " for " + customer;
	}

	public char jobSize() {

		if (quantity <= 25) {
			return 'S';
		} else if (quantity <= 75) {
			return 'M';
		} else if (quantity <= 150) {
			return 'L';
		}
		return 'X';
	}
	
	public double computeTotal() {
		double total = orderAmount;
		switch (jobSize()) {
		case 'M' : total = total - (orderAmount * 0.01);
		break;
		case 'L' : total = total - (orderAmount * 0.02);
		break;
		case 'X' : total = total - (orderAmount * 0.03);
		break;
		}
		if (orderAmount <= 1500) {
			total = total + computeTax();
		}
		return total;
	}
}
