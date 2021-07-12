package com.enthuware.Test6;

public class Question12 {
	public int sum(int i1, int i2) {
		return i1 + i2;
	}

	public int sum(long i1, long i2) {
		return (int) i1;
	}

	public int sum(int i1, long i2) {
		return (int) i2;
	}

	public long sum(long i1, int i2) {
		return i1 + i2;
	}
	
	public static void main(String[] args) {
		
	}

}
