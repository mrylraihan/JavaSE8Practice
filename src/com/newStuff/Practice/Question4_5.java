package com.newStuff.Practice;

public class Question4_5 {
	
	
	public String returnSorted(String a) {
		String[]split = a.split(";");
		String[]numbers = split[0].split(",");
		
		int k = Integer.parseInt(split[1]);
		
		for (int i = 0; i < numbers.length; i+=k) {
			int start = i;
			int end = i + k - 1;
			if (end > numbers.length - 1) {
				break;
			}
			//reverse
			while (start< end) {
				String tmp = numbers[start];
				numbers[start] = numbers[end];
				numbers[end] = tmp;
				start++;
				end--;
				
			}
		}
		
		
		return String.join(",", numbers);
	}
	
	
	public static void main(String[] args) {
		String test1 = "1,2,3,4,5,6,7;2";
		String test2 = "1,2,3,4,5,6,7,8,9,10;3";
		Question4_5 q4 = new Question4_5();
		System.out.println(q4.returnSorted(test2));
		
	}
}
