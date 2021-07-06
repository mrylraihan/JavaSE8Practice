package com.enthuware.Test5;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithJavaAPI{
	public static void main(String[] args)throws Exception {
		List al = new ArrayList();
		al.add(111);
		System.out.println(al.get(al.size()));// throws an exception 
//		It will throw an IndexOutOfBoundsException at run time because of this line.
//		The size() method of ArrayList returns the number of elements. Here, it returns 1. 
//		Since numbering in ArrayList starts with 0. al.get(1) will cause an IndexOutOfBoundsException to be 
//		thrown because only 0 is a valid index for a list of size 1.
	}

}
