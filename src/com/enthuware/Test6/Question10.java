package com.enthuware.Test6;

public class Question10 {
	public int max(int a, int b) {
		if (a>b) return a;
		return b;
	}
	public static void main(String[] args) {
		Question10 q10 = new Question10();
		System.out.println(q10.max(18, 15));
	}

}
