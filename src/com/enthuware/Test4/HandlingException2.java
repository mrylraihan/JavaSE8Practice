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
		}
		
}


