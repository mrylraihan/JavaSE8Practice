package com.enthuware.Test6;
class MyException extends Exception{}
public class ExceptionHandling {

	public void m1()throws MyException{
		throw new MyException();
	}
	public void m2()throws RuntimeException{
		throw new NullPointerException();
	}
	public static void main(String[] args){
		ExceptionHandling ex = new ExceptionHandling();
		try {
			ex.m1();
		} catch (MyException e) {
//			ex.m1(); this wont work because this exception needs to be handled
		}finally {
			System.out.println("in finally block");
			ex.m2();
		}
	}

}
