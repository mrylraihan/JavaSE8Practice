package com.enthuware.Test6;

import java.util.ArrayList;
import java.util.List;

public class WorkingArrayList {
	//Question 13
	public static void main(String[] args) throws Exception {
		List list = new ArrayList();
		list.add("val1");
		list.add("val2");
		list.add(2,"val3");
		list.add(1,"val11");
		System.out.println(list);
	}

}
