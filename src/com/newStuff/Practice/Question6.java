package com.newStuff.Practice;

import java.util.LinkedList;

public class Question6 {
//	class Solution {
	    public void returnReverseList(LinkedList<Integer> l1,LinkedList<Integer> l2) {
	        //iterate through LinkedList
	    	String num1 = "";
	    	String num2 = "";
	    	String sumED;
	    	LinkedList<Integer>result = new LinkedList<Integer>();
	    	for (int i = l1.size()-1 ;0<=i ; --i) {
				num1 = num1 +l1.get(i);
			}
	    	for (int i = l2.size()-1 ;0<=i ; --i) {
				num2 = num2 + String.valueOf(l2.get(i));
			}
	    	
	    	int convert1 = Integer.parseInt(num1);
	    	int convert2 = Integer.parseInt(num2);

	    	sumED= convert1 + convert2 + "";
	    	System.out.println(sumED);
	    	String[] newResult = sumED.split("");
	    	for (int i = newResult.length-1; 0<=i ; i--) {	
				result.add(Integer.parseInt(newResult[i]));
			}
	    	System.out.println(result.toString());	    	
	    	
	    }
//	Input: l1 = [2,4,3], l2 = [5,6,4]
//			Output: [7,0,8]
//			Explanation: 342 + 465 = 807.
//
//	    Input: l1 = [4,7,8], l2 = [9,8,4]
//				Output: [3,6,3,1]
//				Explanation: 874 + 489 = 1363.
	public static void main(String[] args) {
		LinkedList <Integer>linky = new LinkedList<>();
		linky.add(4);
		linky.add(7);
		linky.add(8);
		
		LinkedList  <Integer>linky1 = new LinkedList<>();
		linky1.add(9);
		linky1.add(8);
		linky1.add(4);
		
		
		
		new Question6().returnReverseList(linky, linky1);
		
		
	}
}
