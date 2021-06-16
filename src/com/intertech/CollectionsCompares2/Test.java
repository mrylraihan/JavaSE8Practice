package com.intertech.CollectionsCompares2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public void test() {
		Users user = new Users("Mr.Wally", "McChicken112");
		Users user2 = new Users("RonaldMcDonald", "McNull");
		Users user3 = new Users("TonyTheTiger", "ThereGreet");
		// Comparable, Comparator
		// 2 interfaces defined in java that allow you to sort
		// Comparable is used when trying to sort a custom object Example
		// would be the cat and dogs class in the other package
		List<Users> userList = new ArrayList<>();
		userList.add(user);
		userList.add(user2);
		userList.add(user3);
		Collections.sort(userList);
		userList.forEach(u -> System.out.println(u));
	}

	public void test2() {

		String str1 = "tpage";
		String str2 = "Zpage";

		List<String> stringList = new ArrayList<>();
		stringList.add(str2);
		stringList.add(str1);
		Collections.sort(stringList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}
		});
		stringList.forEach(sl -> System.out.println(sl));

	}
}
