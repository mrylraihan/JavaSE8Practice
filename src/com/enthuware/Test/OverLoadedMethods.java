package com.enthuware.Test;

public class OverLoadedMethods{
	
	
	public int setVar(int a, int b, float c) {
		return (int) (a+b+c);
	}
	
	public int setVar(int a, float b, int c) {
		return c;
		
	}
	public void setVar(int b, float a) {
		
	}
	
	public float setVar(int a) {
		return a;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
