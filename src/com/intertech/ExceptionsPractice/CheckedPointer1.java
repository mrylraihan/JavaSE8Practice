package com.intertech.ExceptionsPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedPointer1 {
	
//	public static void main(String[] args) throws FileNotFoundException {
//		FileInputStream f = new FileInputStream("");
//	}
//or
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("");
		} catch (FileNotFoundException e) {
//			System.out.println("File not found");
			e.printStackTrace();;
		}
		
	}
}
