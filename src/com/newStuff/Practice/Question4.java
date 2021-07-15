package com.newStuff.Practice;

import java.util.Scanner;

public class Question4 {
//Task
	// 1,2,3,4,5,6,7,8,9,10;[3]
	// 3,2,1,6,5,4,9,8,7,10
//    0,1,2,3,4,5,6,7,8,9,10 = index
	
	
	public String randomNumber(String a) {
		a = a.replace(",", "");
		String[] inputSplit = a.split(";");
		String nums = inputSplit[0];
		String num = inputSplit[1]; 
		int newNum = Integer.parseInt(num);
		char[] charArray = nums.toCharArray();
		int cur = 0;
		String newList = ""; 
		
		for (int i = 0; i < charArray.length; i+=newNum) {
			cur +=newNum;
			int start = i;
			int end = cur - 1;
			if (end > charArray.length - 1) {
				break;
			}
			
			char tmp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = tmp;
		}
		
//		newList = new String(charArray);
		for (char c : charArray) {
			if (c == charArray[charArray.length-1]) {
				newList = newList + c;
			}else {
				newList = newList +c+",";
			}
			
		}
		return newList;
	}
	

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a list of numbers and k to swap");
//		String userInput = sc.next();
		String one = "1,2,3,4,5,6,7,8,9,10;4";
		System.out.println(new Question4().randomNumber(one));
		
		
	}
}
