package com.intertech.InheritancePrac2;

import com.acme.utils.MyDate;

public class Pointer {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString());
		Person m = new Person("Mike", "Luca", "Staten island", new MyDate(07,8,1995));
		System.out.println(m.toString());
	}

}
