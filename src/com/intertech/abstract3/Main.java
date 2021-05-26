package com.intertech.abstract3;

public class Main {
	public static void main(String[] args) {
		Consultant c = new Consultant();
		c.firstName = "Wallie";
		c.title = "Developer";
		System.out.println(c.getName());
		System.out.println(c.pay());
		
	}
	

}
