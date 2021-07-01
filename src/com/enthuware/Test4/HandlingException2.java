package com.enthuware.Test4;



class Base {
	void method1() throws java.io.IOException, NullPointerException{
		someMethod("arguments");
	}
	int someMethod(String str) {
		if(str == null ) throw new NullPointerException();
		else return str.length();
	}
}
public class HandlingException2 extends Base{
		void method1() {
			someMethod("args");
			System.out.println(someMethod("Pew pew pew pew pew"));
		}
		public static void main(String[] args) {
			HandlingException2 he = new HandlingException2();
			he.method1();
			System.out.println(he.someMethod("Hello"));
		}
		
}


