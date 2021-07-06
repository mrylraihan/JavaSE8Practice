package com.intertech.Basics;

public class TerneraryOperator {
	public static void main(String[] args) {
		int x = 100;//103
		int a = x++;//100
		int b = ++x;//102
		int c = x++;//102
		//(Condition) ? {true block} : {false block}
		int d = (a<b) ? (a<c)? a: (b<c) ? b: c:a;
		System.out.println(d);
	}

}
