package com.intertech.lambdaPractice6;

public class Pointer {
	public static void main(String[] args) {
		PromotionService ps = new PromotionService();
		ps.sendPromotion(customer -> customer.getAge()>=18);
	
		
		
		
	}

}
