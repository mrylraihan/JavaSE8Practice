package com.enthuware.Test3;

public class DataTypes {
	public static String stringTest(String s){
         return s.replace('h', 's');
    }
	public static void main(String[] args) {
		System.out.println(Boolean.parseBoolean("true") == true);
		String s = "hell";
		String newS = stringTest(s);
		
		System.out.println(newS);
		
	}

}
