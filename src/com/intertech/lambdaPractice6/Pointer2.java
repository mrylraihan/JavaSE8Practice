package com.intertech.lambdaPractice6;

import java.util.function.Predicate;

public class Pointer2 extends PromotionService implements Predicate<Customer>{

	@Override
	public boolean test(Customer t) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void testingAge(boolean a) {
		if(a) {
			System.out.println("sign up for our mailing");
		}else
			System.out.println("you're too young");
	}
	public static void main(String[] args) {
		
		Customer customer4 = new Customer(15, "Hana");
		Customer customer5 = new Customer(20, "Shaj");
		Customer customer6 = new Customer(40,"Momma dukes");
		
		Predicate<Customer> predicate = new Pointer2();
		
		predicate = (Customer t) -> t.getAge()>=18;
		boolean test1 = predicate.test(customer4);
		boolean test2 = predicate.test(customer5);
		boolean test3 = predicate.test(customer6);
		
		testingAge(test1);
		testingAge(test2);
		testingAge(test3);
		
	}

}
