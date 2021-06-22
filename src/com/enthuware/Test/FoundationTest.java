package com.enthuware.Test;

public class FoundationTest  {
	public static void main(String[] args) {
		System.out.println(args == null);
		
		String name1 = "Wayel";
		String nameR = name1.replace('W', 'M');
		long y = 123_456L;
		float f1 = 567_789_897F;
		int p, j, k;
		p = j = k = 9;
		System.out.println(p);
		
		
		StringBuilder name = new StringBuilder("Wallie");
		System.out.println(nameR);
		System.out.println(name1);
	
		int[] numlist = {1,2,3};
		try {
			numlist[3] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this is a uncheck exception caught");
		}
		
		int i = 1234567890;
		float f = i;
		System.out.println();
	}

}
