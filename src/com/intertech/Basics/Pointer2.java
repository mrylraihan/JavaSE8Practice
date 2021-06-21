package com.intertech.Basics;

import com.intertech.CollectionsSetsPractice.Customer;

public class Pointer2 {
	public static void main(String[] args) {
		// how to instantiate an object
		//Object can have both behavior and state 
		//this allows us to assign the object to variable 
		// we are creating a string the right side of the equals and we are assigning it to the left side called s 
		// when ever we use the new key word that means we are creating a new object of the object type 
		
		//String //Reference Type , s //Reference Variable , = // Assignment operator , new // new Keyword , String() // Object type
		String s = new String(); 
		
		//primitives do not use the key word new or have an object type, they are simply assigned a value
		//you just declare the variable and then you assign the value
		//ex
		int i =5;
		char c = 'c';
		double pi = 3.14;
		
		// when we create an object the correct term to use is instantiating an object
		//Another important note about creating objects is to understand when the object is actually created
		//when a reference is defined, this doesnt create the object, what creates the object is the new is used 
		String a;
		a = new String();// this is when the object is created and assigned to a
		// we created a customer object with the state name and state(where some one is from) 
		Customer customer = new Customer("New Jersey",  "Jersey Mike");
		System.out.println(customer.getName()+" from "+ customer.getState());
		
		//reassigning the customer object with new object and state
		customer = new Customer("New York",  "Brooklyn Joe");
		System.out.println(customer.getName()+" from "+ customer.getState());
		
		//reassigning the customer object again 
		customer = new Customer("Florida","Florida man");
		System.out.println(customer.getName()+" from "+ customer.getState());
		//if we have the same reference variable we can keep reassigning too a new object
		// every time we reassign the reference variable to a new object it no longer references the old object.
		// once the reference variable is no longer referring to the old object its illegible for garbage collection 
	}
}
