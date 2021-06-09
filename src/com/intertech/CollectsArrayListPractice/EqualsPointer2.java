package com.intertech.CollectsArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EqualsPointer2 {
	public static void main(String[] args) {
		ArrayList<String> birds = new ArrayList<String>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);

		for (String bird : birds) {
			System.out.println(bird);
		}
		
		Iterator iter = birds.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("--------------------> Iterator");
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Html");
		
		Iterator iL = languages.iterator();
		while(iL.hasNext()) {
			System.out.println(iL.next());
		}
		
		System.out.println("--------------------> Iterator");
		
		ListIterator iL2 = languages.listIterator();
		System.out.println(iL2.hasNext());
		System.out.println(iL2.nextIndex());
		
		System.out.println("------------------------> forloop with lambda function");
		languages.forEach(lang-> System.out.println(lang));
		

	}
}
