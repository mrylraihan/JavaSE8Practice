package com.intertech.ExceptionsPractice;

public class OverStudyingException extends Exception{
	public OverStudyingException(String message) {
		super(message);
		System.out.println("Hey relax");
	}
}
