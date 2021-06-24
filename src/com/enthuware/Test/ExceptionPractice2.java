package com.enthuware.Test;

public class ExceptionPractice2 {
	public static void m1()throws Exception{
		throw new Exception();
	}
	
	public static void main(String[] args) throws Exception {
		try {
			m1();
			System.out.println("A");
//		} catch (Exception e) {
//			System.out.println("caught in catch block");
		}finally {
			System.out.println("B");
		}
		System.out.println("C");
	}
}
