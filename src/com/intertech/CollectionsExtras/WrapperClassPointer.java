package com.intertech.CollectionsExtras;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassPointer {
	public static void main(String[] args) {
		System.out.println(Integer.sum(3, 4));
		System.out.println(3 + 4);

		List list = new ArrayList();
		int j = 7;
		int y = 8;
		list.add(Integer.valueOf(j));
		list.add(y);
		System.out.println(list);
		
		Integer wrapInt = Integer.valueOf(7);
		int a = wrapInt.intValue();
		
		Character wrapChar = Character.valueOf('r');
		char r = wrapChar.charValue();
		
	}
}
