package com.enthuware.Test4;

import java.util.ArrayList;

public class WorkingWithData {
	public static void main(String[] args) throws Exception{
		ArrayList<Double> al = new ArrayList<Double>();
//		al.add(111); wont work because its not a double cant box an int to a double 
		System.out.println(al.indexOf(1.0));
		System.out.println(al.contains("String"));
		
	}

}
