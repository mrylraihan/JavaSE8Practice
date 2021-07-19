package com.newStuff.Practice;

public class BraxProblem2 {

	public int multArray(int[] a) {

		int answer = 1;

		for (int i = 0; i < a.length; i++) {
			answer *= a[i];
			if (answer < 0) {
				answer = -1;
			} else if (answer > 0) {
				answer = 1;
			} else if (answer == 0) {
				answer = 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[]a = {1,2,3,4,0};
		BraxProblem2 bx = new BraxProblem2();
		System.out.println(bx.multArray(a));
	}

}
