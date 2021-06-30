package com.intertech.Basics;

public class JavaIdentifiers {
	//135pg in book 
	//Identifiers are the names that identify the elements in a program 
	//this is names of classes, methods, and variables 
	//they can contain letters, digits, underscores (_), and dollar signs($)
	//Must start with a letter, or an underscore, or a dollar sign($), it cannot start with a digit and it can not contain spaces
	// it also can be a reserved word ex main, class, String
	
	static String name;// will automatically be null by default// can be used but directly by the class
	String lastName;//will automatically be null by default // but cant use unless u have an instance of the class 

	public static void main(String[] args) {
//		String _; invalid solo
		String _helloWorld = "Hello"; // Valid
//		String true; invalid because its a keyword
//		String words; /valid but, invalid when trying to use because it need to be instaniated before use in a method this doesnt default to null 
		String Public = null; // Valid
//		String 1980_s = "ewew"; //invalid due to variable names cant be numbers 
		String _Q2_ = "Q2"; // Valid
		
		System.out.println(_helloWorld);
		System.out.println(Public);
		
		JavaIdentifiers ji = new JavaIdentifiers();
		
		System.out.println(ji.lastName);
		System.out.println(name);
		String main = "main"; // valid
		System.out.println(main);
		System.out.println(_Q2_);
		

		
	}

}
