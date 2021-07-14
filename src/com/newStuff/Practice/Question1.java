package com.newStuff.Practice;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your of List numbers then you k number after ;  ");
//		String word1 = sc.nextLine();
		String word1 = "1,2,3,4,5,6,7,8,9,10;2";
		word1 = word1.replace(",", "");
		String[] numlist = word1.split(";");
		String one = numlist[0];
		String two = numlist[1];
		char[] numberList = one.toCharArray();
		int numberSwitch = Integer.parseInt(two);

		for (int i = 0; i < numberList.length; i += numberSwitch) {
			if (numberList.length > numberSwitch) {
				int start = i;
				int end = numberSwitch-1;
				char tmp = numberList[start];
				numberList[start] = numberList[end];
				numberList[end] = tmp;
				numberSwitch += numberSwitch - 1;
			
			}else {
				break;
			}
			String str = new String(numberList);
			 String str2 = String.valueOf(numberList);
		      System.out.println(str2);

		}
		 
		System.out.println(one);
		System.out.println(two);

		// 12345;2
	}

}
