package com.newStuff.Practice;

import java.util.Scanner;

public class Question3 {

	public void sortingByK(String a) {
		a = a.replace(",", "");
		String[] numlist = a.split(";");
		String one = numlist[0];
		String two = numlist[1];
		char[] numberList = one.toCharArray();
		int numberSwitch = Integer.parseInt(two);
		int cur = 0;
		String newNumList = "";
		for (int i = 0; i < numberList.length; i += numberSwitch) {
			cur += numberSwitch;
			int start = i;
			int end = cur - 1;
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
			if (c == numberList[numberList.length - 1]) {
				newNumList = newNumList + c;
			} else {
				newNumList = newNumList + c + ",";
			}
		}
		System.out.println(newNumList);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your of List numbers then you k number after ;  ");
		String word1 = sc.nextLine();
		Question3 q3 = new Question3();
		q3.sortingByK(word1);

	}
}
