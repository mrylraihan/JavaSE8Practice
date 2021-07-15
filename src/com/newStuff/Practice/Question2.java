package com.newStuff.Practice;

public class Question2 {
	
	public static void main(String[] args) {
		//1234567;2
		String numbs = "12345678910";
		int n = 3;
		int cur = 0;
		char[] chaArray = numbs.toCharArray();
		String newNumList =new String("");
		for (int i = 0; i < chaArray.length; i+=n) {
			cur+=n;
			int start = i;
			int end = cur-1;
			if (end > chaArray.length-1) {
				break;
			}
			char tmp = chaArray[start];
			chaArray[start] = chaArray[end];
			chaArray[end] = tmp;
			
			newNumList = new String(chaArray);
		}
		
		System.out.println(newNumList);
//		System.out.println(numbs.length());
		
		
//		for (char singleN : chaArray) {
//		   if (singleN == chaArray[chaArray.length-1]) {
//			System.out.println(singleN);
//		}else {
//			System.out.print(singleN+",");
//		}
//			
//		}
	}

}
