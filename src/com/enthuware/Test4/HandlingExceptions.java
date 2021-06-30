package com.enthuware.Test4;

import java.io.*;

public class HandlingExceptions {
	
	String[] arguments;
	public float parseFloat(String s){
		   float f = 0.0f;
		   try{
		      f = Float.valueOf(s).floatValue();
		      return f ;
		   }
		   catch(NumberFormatException nfe){
		      System.out.println("Invalid input " + s);
		      f = Float.NaN ;
		      return f;
		   }
		   finally { System.out.println("finally");  }
		}
	public static void main(String[] args) {
		System.out.println(new HandlingExceptions().main);
	}
	int main;
}