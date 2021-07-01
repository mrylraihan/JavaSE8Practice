package com.enthuware.Test4;

public class ScopePractice {
	public static void main(String[] args) {
		Integer num = 1;

		sumup(num);
		System.out.println(num);

	}

	static void sumup(Integer a) {
		a += 2;
	}

}
