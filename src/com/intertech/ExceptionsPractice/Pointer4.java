package com.intertech.ExceptionsPractice;

public class Pointer4 {
	
	public static void errorMethod(int...num) {
		num[10]=25;
	}
	public static void main(String[] args) {
		int[]nums = new int[5];
		try {
			System.out.println("in try 1");
			errorMethod(nums);
			System.out.println("in try 2");
		} catch (Exception e) {
			System.out.println("in catch");
		}
		System.out.println("Rest of the program");
	}
}
