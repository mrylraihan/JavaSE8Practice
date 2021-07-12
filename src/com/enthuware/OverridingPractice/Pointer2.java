package com.enthuware.OverridingPractice;

public class Pointer2 {

	public Integer sumUp(Integer a, Integer b) {
		System.out.println("Integer");
		return  a + b;
	}
	public float sumUp(float a, float b) {
		System.out.println("float");
		return a + b;
	}
	public double sumUp(double a, double b) {
		System.out.println("double");
		return a + b;
	}
	public long sumUp(long a, long b) {
		System.out.println("long");
		return a + b;
	}
	
	public static void main(String[] args) {
		Pointer2 p = new Pointer2();
		Integer in = new Integer("2");
		System.out.println(p.sumUp(in, in));
		System.out.println(p.sumUp(2, 2));
		System.out.println(p.sumUp(2.0, 2.0));
	}


}
