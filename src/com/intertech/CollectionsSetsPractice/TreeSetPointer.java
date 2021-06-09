package com.intertech.CollectionsSetsPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPointer {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add(1);
		tree.add(2);
		tree.add(100);
		tree.add(77);
		tree.add(34);
		tree.add(100);
		// Tree set Automatically sorts the elements
		System.out.println(tree);

		Iterator iter = tree.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
