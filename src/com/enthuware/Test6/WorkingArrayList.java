package com.enthuware.Test6;

import java.util.ArrayList;
import java.util.List;

public class WorkingArrayList {
	
	public static void main(String[] args) throws Exception {
		List list = new ArrayList();
		list.add("val1");
		list.add(1,"val2");
		list.add(2,"val3");
		list.add(1,"val11");
		System.out.println(list);
	}

}
