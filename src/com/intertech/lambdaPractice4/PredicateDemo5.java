package com.intertech.lambdaPractice4;

import java.util.function.Predicate;

public class PredicateDemo5 implements Predicate<String>{

	@Override
	public boolean test(String t) {
		if(t == "Wallie") {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Predicate<String> predicate2 = new PredicateDemo5();
		Predicate<String> predicate3 = new PredicateDemo5();
		
		predicate3 = (String t)-> t.equalsIgnoreCase("Ryan")? true: false;
		boolean test3 = predicate3.test("ryan");
		
	boolean test1 = predicate2.test("Wallie");
	boolean test2 = predicate2.test("Amy");
	System.out.println(test1);
	System.out.println(test2);
	System.out.println(test3);
	}

}
