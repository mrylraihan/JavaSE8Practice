package com.intertech.lambdaPractice4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateDemo4 {

	
	public static void main(String[] args) {
		Predicate<String> predicate3 = (String t) ->{
			if(t == "Wallie") {
				return true;
			}else {
				return false;
			}
		
		};
		
	boolean test1 = predicate3.test("Wallie");
	boolean test2 = predicate3.test("Amy");
	System.out.println(test1);
	System.out.println(test2);
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
	
	Predicate<Integer> predicate = (x)-> x > 5;
	
	Predicate<Integer> predicate1 = (x)-> x < 11;
	
	list.stream().filter(predicate.and(predicate1)).collect(Collectors.toList()).forEach(System.out::println);
	
	}
	
	
	

}
	

