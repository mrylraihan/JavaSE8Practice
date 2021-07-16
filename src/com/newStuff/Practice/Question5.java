package com.newStuff.Practice;

public class Question5 {
	// Task
	// 1,2,3,4,5,6,7,8,9,10;[3]
	// 3,2,1,6,5,4,9,8,7,10
//		    0,1,2,3,4,5,6,7,8,9,10 = index

	public String randomNumber(String a) {
//		a = a.replace(",", "");
		String[] inputSplit = a.split(";");
		String num = inputSplit[1];
		int newNum = Integer.parseInt(num);
		String[] stringArray = inputSplit[0].split(",");
		int cur = 0;
		String newList = "";

		for (int i = 0; i < stringArray.length; i += newNum) {
			cur += newNum;
			int start = i;
			int end = cur - 1;
			if (end > stringArray.length - 1) {
				break;
			}

			String tmp = stringArray[start];
			stringArray[start] = stringArray[end];
			stringArray[end] = tmp;
		}

//				newList = new String(charArray);
		for (String c : stringArray) {
			if (c == stringArray[stringArray.length - 1]) {
				newList = newList + c;
			} else {
				newList = newList + c + ",";
			}

		}
		return newList;
	}

	public static void main(String[] args) {
//				 
		String one = "1,2,3,4,5,6,7,8,9,10;2";
		String two = "1,2,3,4,5,6,7,8,9;3";
		System.out.println(new Question5().randomNumber(one));

	}

}
