package com.intertech.Basics;

public class SuperPractice extends Parent{
	String name = "SuperPractice";
	
	public SuperPractice(){
		super();
		System.out.println("in SuperPRactice");
	}
	 public void sayHi() {
		 System.out.println("Hi from sp :" + this.name);
	 }
	 
	
	public static void main(String[] args) {
		SuperPractice sp = new SuperPractice();
		System.out.println("-------->");
		Parent p = new SuperPractice();
		System.out.println("-------->");
		GrandParent gp = new GrandParent();//depending on the object constructor 
		//used you will have access to there instance variables 
		System.out.println("-------->");
		System.out.println(sp.name);
		System.out.println(p.name);
		System.out.println(gp.name);
		
		sp.sayHi();
		p.sayHi();// using the overridden method of the child using the childs instance variables
		gp.sayHi();// here the method only has access to its class instances variables
	}
}
class Parent extends GrandParent{
	String name = "Parent";
	 public Parent(){
		 super();
		 System.out.println("in parent");
	 }
	 
	 public void sayHi() {
		 System.out.println("Hi from p :" + this.name);
	 }
	 
}

class GrandParent{
	String name = "Grandparent";
	public GrandParent(){
		System.out.println("in grandparent");
	}
	 public void sayHi() {
		 System.out.println("Hi from g :" + this.name);
	 }
	 
}
