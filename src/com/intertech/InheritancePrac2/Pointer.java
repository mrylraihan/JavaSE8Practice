package com.intertech.InheritancePrac2;

import java.util.Date;

import com.acme.utils.MyDate;

public class Pointer {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getFullName());
		System.out.println(p.toString());
		Person m = new Person("Mike", "Luca", "Staten island", new MyDate(7,8,1995));
		System.out.println(m.toString());
		System.out.println(m.getFullName());
		Child c = new Child();
		System.out.println(c.getFullName());
		Child cc = new Child("CC","Tyson","Brooklyn", new MyDate(9,10,1999) );
		System.out.println(cc.toString());
		System.out.println(cc.getFullName());
	}

}
