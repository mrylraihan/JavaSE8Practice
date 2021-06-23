package com.intertech.ExceptionsPractice;

public class Pointer11 {
	public static void main(String[] args) throws Exception {
		try {
			m1();
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("Exception caught in the main");
		}finally {
			System.out.println("B");
		}
		System.out.println("C");
	}
	public static void m1()throws Exception{
		throw new Exception();
	}
}
