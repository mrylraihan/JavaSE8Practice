package com.newStuff.Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question6 {
//	class Solution {
	    public void returnReverseList(LinkedList<Integer> l1) {
	        //iterate through LinkedList
	    	String num1 = "";
	    	String num2 = "";
	    	String sumED;
	    	LinkedList<String>result = new LinkedList<String>();
	    	for (int i = l1.size()-1 ;0<=i ; --i) {
				num1 = num1 +l1.get(i);
			}
//	    	for (int i = l2.size()-1 ;0<=i ; --i) {
//				num2 = num2 + String.valueOf(l2.get(i));
//			}
	    	System.out.println(num1);
//	    	int convert1 = Integer.parseInt(num1);
//	    	int convert2 = Integer.parseInt(num2);
//	    	sumED= convert1 + convert2 + "";
	    	
//	    	String answer = String.valueOf(sumED);
//	    	for(int i = answer.length()-1 ;0<=i ; --i) {
////	    		result.add(answer.charAt(i));
//	    	}
//	    	System.out.println(sumED);
//	    	
	    	
	    	
	    	
	    }
//	Input: l1 = [2,4,3], l2 = [5,6,4]
//			Output: [7,0,8]
//			Explanation: 342 + 465 = 807.

	public static void main(String[] args) {
		LinkedList <Integer>linky = new LinkedList<>();
		linky.add(2);
		linky.add(4);
		linky.add(3);
		
		LinkedList  <Integer>linky1 = new LinkedList<>();
		linky.add(5);
		linky.add(6);
		linky.add(4);
		
		
		
		new Question6().returnReverseList(linky);
		
		
	}
}
