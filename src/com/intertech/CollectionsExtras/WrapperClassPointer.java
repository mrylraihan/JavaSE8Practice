package com.intertech.CollectionsExtras;

import java.util.ArrayList;
import java.util.List;

import com.intertech.ArrayPractice2.Employee;
import com.intertech.ArrayPractice2.Secretary;

public class WrapperClassPointer {
	public static void main(String[] args) {
		System.out.println(Integer.sum(3, 4));
		System.out.println(3 + 4);

		List list = new ArrayList();
		int j = 7;
		int y = 8;
		double d = 3.00;
		list.add(Integer.valueOf(j));
		list.add(y);
		System.out.println(list);
		
		Integer wrapInt = Integer.valueOf(7);
		int a = wrapInt.intValue();
		
		Character wrapChar = Character.valueOf('r');
		char r = wrapChar.charValue();
		
		Double wrapDouble = Double.valueOf(d);
		double dd = wrapDouble.doubleValue();
		
		//etc.. with all the wrapper classes 
		
		List staff = new ArrayList();
		Employee e = new Employee();
		e.name = "Wallie";
		staff.add(e);
		Secretary s = new Secretary();
		s.name = "Shaj";
		staff.add(s);
		String x = "Mr.Raihan";
		staff.add(x);
		System.out.println(staff);
		Object bill = staff.get(0);
		Object bestSec = (Secretary)staff.get(1);
		System.out.println(bill);
		System.out.println(bestSec);
	}
}
