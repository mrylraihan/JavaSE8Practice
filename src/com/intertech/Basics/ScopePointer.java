package com.intertech.Basics;

public class ScopePointer {
	String name = "Wallie";
	int age = 28;
	//Instance variables are variables that are inside the class
	// also known as fields, attributes, properties
	//
	
	static String words = "the";
	//Variables that have the modifier static that means its going
	//to belong to the class itself. 
	
	public String getDescription(/**parameter variable*/) {
		String desc = name + " " + age;// desc is a variable defined in this method 
		return desc;
	}
	//local variables
	//we also have variables defined inside a method, these can be in 
	//two different places, one would be in the parameter of the method
	//two would be defined/declared in the method its self.
	//they dont always refer to a method, anything in a code block, like forloops, if statments,and so on
	
    //there are 3 actually different levels of scope, Instance variable, Static variable, local variable
	
	
}
