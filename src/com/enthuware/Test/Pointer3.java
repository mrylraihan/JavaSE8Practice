package com.enthuware.Test;

class StringWrapper{
	private String theVal;

	@Override
	public String toString() {
		return theVal;
	}
	public StringWrapper(String str) {
		this.theVal = str;
	}
}
public class Pointer3 {
	public static void main(String[] args) {
		StringWrapper sw = new StringWrapper("How are you");
		StringBuilder sb = new StringBuilder("How are you");
		System.out.println("Hello, "+sw);
		System.out.println("Hello, "+sb);
	}
}
