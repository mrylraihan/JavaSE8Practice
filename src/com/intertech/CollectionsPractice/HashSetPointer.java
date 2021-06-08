package com.intertech.CollectionsPractice;

import java.util.HashSet;

public class HashSetPointer {
	public static void nameinSystem(HashSet<String> a, Customer c) {
		if (a.contains(c.getName())) {
			System.out.println("name is in our system");
		}else {
			System.out.println("Customer Name not in our system yet");
		}
	}
	
	public static void nameinSystem(HashSet<String> a,String name) {
		if (a.contains(name)) {
			System.out.println("name is in our system");
		}else {
			System.out.println("Customer Name not in our system yet");
		}
	}
	public static void main(String[] args) {
		Customer customer = new Customer("New York", "Wallie");
		Customer customer2 = new Customer("New York", "Mike");
		
		
		HashSet salesRegion = new HashSet();
		//add all valid sale regions
		salesRegion.add("Minnesota");
		salesRegion.add("New York");
		salesRegion.add("New Jersey");
		salesRegion.add("Maryland");
		salesRegion.add("Minnesota");
		//Check to see if customer is in your region 
		String state = customer.getState();
		if(salesRegion.contains(state)) {
			System.out.println("customer is in our region");
		}else {
			System.out.println("customer is not in our region");
		}
		
		HashSet<String> namesCustomer = new HashSet<String>();
		namesCustomer.add(customer.getName());
		namesCustomer.add("Mike");
		System.out.println(namesCustomer);
		nameinSystem(namesCustomer, customer2);
		nameinSystem(namesCustomer, "Ryan");
		
	}
}
