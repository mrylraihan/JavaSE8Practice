package com.intertech.Basics;

public class GarabageCollectionsEx {
	String a;
	String b;
	static String c;
	public GarabageCollectionsEx (String a, String b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static void main(String[] args) {
//		primitives arent eligible for garbage collections 
//		int num = 1;
//		num = null;
		GarabageCollectionsEx gbObject = new GarabageCollectionsEx("1", "2", "3");
		gbObject = null;// Once new GarabageCollectionsEx("1", "2", "3") does'nt have a reference its eligible for garbage collection
		System.err.println(gbObject.a);// this will give us a null pointer exception because  those instance
		//variables have been removed once set to null
		System.out.println(c);// this will be fine because this is a static variable it was just assigned in the previous object
		System.gc();// forces Garbage collections command, this hints to the garbage collector but there's no garentee 
		String name = "a";
		String swap;
		swap  = name;
		name = null;// now "a" because eligible for garbage collection 
		System.out.println(swap);
		System.out.println(name);
		//When ever the old object is not being referenced it is eligible for garbage collection
		//another example
		
	}
	
}
 