package com.newStuff.Practice;

public class Question2 {

	public static void main(String[] args) {
		// 1234567;2
		String numbs = "123456789";
		int n = 2;
		int cur = 0;
		char[] chaArray = numbs.toCharArray();
		String newNumList = "";
		for (int i = 0; i < chaArray.length; i += n) {
			cur += n;
			int start = i;
			int end = cur - 1;
			if (end > chaArray.length - 1) {
				break;
			}
			char tmp = chaArray[start];
			chaArray[start] = chaArray[end];
			chaArray[end] = tmp;

//			newNumList = new String(chaArray);
		}

		for (char singleN : chaArray) {
			if (singleN == chaArray[chaArray.length - 1]) {
				newNumList = newNumList + singleN;
			} else {
				newNumList = newNumList + singleN + ",";
			}
		}
		System.out.println(newNumList + "; "+n);
	}

}
