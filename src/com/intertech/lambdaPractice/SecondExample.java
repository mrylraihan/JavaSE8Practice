package com.intertech.lambdaPractice;

public class SecondExample extends Operations{
	public static void main(String[] args) {
		String name = "Wallie";
		int a = 3;
		SecondExampleInterface b = ()->System.out.println(name +" thats my name");
		b.sayName();
		
		ThirdExampleInterface c = (num1,num2)->{return "this addition of "+ num1 +" and "+ num2 +" is " + (num1+num2);};
		System.out.println(c.data(5, 6));
		
//		greetingFunction = ()-> System.out.println("Hello World");
//		
//		greet((name)-> System.out.println("Hello World"););
		
		doubleNumInterface y = (int num1)-> num1 * 2;
		System.out.println(y.doubleNum(5));
		
		GreetInterface greet = ()->System.out.println("Hello World ");
		 greet.greetingFunction();
		
	}

}
