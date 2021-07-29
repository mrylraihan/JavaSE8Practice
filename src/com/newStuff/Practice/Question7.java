package com.newStuff.Practice;

public class Question7 {
	// 1,2,3,4,5,6,7,8;4

	public String mixedNumbers(String a) {
		String[] split = a.split(";");
		int k = Integer.parseInt(split[1]);
		String[] numbers = split[0].split(",");

		for (int i = 0; i < numbers.length; i += k) {
			int start = i;
			int end = i + k - 1;
			if (numbers.length - 1 < end) {
				break;
			}
			String tmp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = tmp;
		}

		return String.join(",", numbers);
	}

	public static void main(String[] args) {
		String numlist = "1,2,3,4,5,6,7,8,9,10;4";

		Question7 q7 = new Question7();
		System.out.println(q7.mixedNumbers(numlist));
	}

}
