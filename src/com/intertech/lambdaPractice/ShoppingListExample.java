package com.intertech.lambdaPractice;

import java.util.ArrayList;

public class ShoppingListExample {
	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("Meat");
		shoppingList.add("Milk");
		shoppingList.add("Candy");
		shoppingList.add("Eggs");
		shoppingList.add("Carrots");

//		for (String item : shoppingList) {
//			System.out.println(item);
//		}
		shoppingList.forEach((n)-> System.out.println(n));

	}

}