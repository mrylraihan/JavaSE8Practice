package com.enthuware.Test;

public class Pointer2 {
	// TODO Auto-generated method stub
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {

		int index = 1;
		try {
			getArray()[index = 4]++;
		} catch (Exception e) {
			System.out.println("Index = " + index);
		}
	}
}
