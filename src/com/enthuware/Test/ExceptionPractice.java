package com.enthuware.Test;

public class ExceptionPractice {
	public static void main(String[] args) throws Exception  {
		ExceptionPractice tc = new ExceptionPractice();
		tc.myMethod();
		
	}

	public void myMethod() throws Exception {
		yourMethod();
		
	}

	public void yourMethod() throws Exception {
		throw new Exception();
	}
}
