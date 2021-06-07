package com.intertech.ArrayListPractice1;

import java.util.ArrayList;

public class EqualsPointer2 {
	public static void main(String[] args) {
		ArrayList<String> birds = new ArrayList<String>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0,"blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);
	}
}
