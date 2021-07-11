package com.intertech.StringBufBuildPractice;

public class StringComparisonPointer {
	public static void main(String[] args) {
		String b = "Hello";
		String d = "Hello";
		String a = new String("Hello");
		System.out.println(a == b);//false
		System.out.println(b == d);//true checks the String literal pool
		System.out.println(a.equals(b));//true checks the value
		System.out.println(b.equals(d));//true checks the value
		
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder ssb = new StringBuilder("Hello");
		
//		System.out.println(sb == sf);this wont work because the type this 
		//is a StringBuilder you can compare it to another String literal, object, 
		//or StringBuffer, it has to be the same type, same with StringBuffer
		System.out.println(sb == ssb);//false
		System.out.println(sb.equals(b));//false
		System.out.println(sb.equals(ssb));//false too because they are different objects
		
		StringBuffer sf = new StringBuffer("Hello");
		StringBuffer ssf = new StringBuffer("Hello");
		
		System.out.println(sf == ssf);//false too
		System.out.println(sf.equals(ssf));//false too because they are different objects
	
		//playing with String buffer and builder methods to see
		//if they need to be stored if modified 
//		System.out.println(sb.insert(5, "hey")); or you can do it the way below 
		System.out.println("------StringBuilder");
		System.out.println(sb.insert(sb.length(), "hey"));//Hellohey
		System.out.println(sb.append(a));//HelloheyHello
		//or
		System.out.println(sb.insert(5, "hey"));//HelloheyheyHello
		
		System.out.println("------StringBuffer");
		System.out.println(sf.insert(sf.length(), "bye"));
		System.out.println(sf);
		
			}

}
