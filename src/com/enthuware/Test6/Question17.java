package com.enthuware.Test6;

public class Question17 {
	public double methodX(byte by) {
		double d = 10.0;
		return (long) by / d * 3;//this does 60 / 10 first then * by 3
	}

	public static void main(String[] args) {
		byte a = 60;
		double d = new Question17().methodX(a);
		System.out.println(d);
	}
}
