package com.intertech.lambdaPractice6;

import java.util.function.Predicate;

public class PromotionService implements Predicate<Customer> {

	@Override
	public boolean test(Customer t) {
		// TODO Auto-generated method stub
		return false;
	}

	private Customer customer = new Customer(15, "Wallie");


	public void sendPromotion(Predicate<Customer> p) {
		if (p.test(customer)) {
			System.out.println("Enjoy our mailing");
		} else {
			System.out.println("your too young for our mailing list");
		}
	}
	
}
