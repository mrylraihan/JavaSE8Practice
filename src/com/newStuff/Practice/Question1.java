package com.newStuff.Practice;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your of List numbers then you k number after ;  ");
		String word1 = sc.nextLine();
//		String word1 = "1,2,3,4,5,6,7,8,9,10;2";
		word1 = word1.replace(",", "");
		String[] numlist = word1.split(";");
		String one = numlist[0];
		String two = numlist[1];
		char[] numberList = one.toCharArray();
		int numberSwitch = Integer.parseInt(two);
		int cur = 0;
		String newNumList =new String("");
		for (int i = 0; i < numberList.length; i += numberSwitch) {
			cur+=numberSwitch;
			int start = i;
			int end = cur-1;
			if (end > numberList.length - 1) {
				break;
			}
			char tmp = numberList[start];
			numberList[start] = numberList[end];
			numberList[end] = tmp;
			
//			newNumList = new String(numberList);
		      
		}
		 
//		System.out.println(newNumList);
		
		for (char c : numberList) {
			if (c == numberList[numberList.length-1]) {
				System.out.print(c);
			}else {
				System.out.print(c +",");
			}
		}

		// 12345;2
	}

}
