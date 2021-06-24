package com.intertech.StringBufBuildPractice;

public class StringPointer {
	public static void main(String[] args) {
		String s1 = new String("Wallie");//new string object
		String s2 = "Wallie";//string pool literal
		String s3 = "Wallie";//string pool literal
		String s4 = new String("Wallie");// new string object
		System.out.println(s2.equals(s3));//true
		System.out.println(s2 == s3);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1 == s4);//false
		
		String ss = "";//this is an empty string which is different then null
		String sn = null;// this is a String that isnt refering to anything.
		
//		substring(int beginIndex)
//		Returns a new string that is a substring of this string.
//		substring(int beginIndex, int endIndex)
//		Returns a new string that is a substring of this string.
		String s = new String("Hello World   ");
		String sub = s.substring(4,10);// returns o Worl
		String trimmed = s.trim();//re moves teh empty spaces in "Hello World   "
		String upper = s.toLowerCase(); //lowercases everything
		int l = s.length(); // this return 14
		
		String greet = "Hello ";
		String name = "Wallie";
		String greetName = greet + name;//returns the combines strings "Hello Wallie"
		System.out.println(greetName);
		
		String dog = "My Dog";
		dog += " has Fleas";
		System.out.println(dog);// dog is reassign to the concatenated string "My dog has fleas"
		//String Api in oracle https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		
	}

}
