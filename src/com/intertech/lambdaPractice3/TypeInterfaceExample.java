package com.intertech.lambdaPractice3;

public class TypeInterfaceExample {
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
	
	
	
	public static void main(String[] args) {
//		StringLengthLambda myLambda = (String s)->s.length();
//		StringLengthLambda myLambda = s->s.length();
//		System.out.println(myLambda.getLength("Hello World"));
		
		
		
		
		printLambda(s->s.length());
		
		
		
		
	}
	
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	
}
