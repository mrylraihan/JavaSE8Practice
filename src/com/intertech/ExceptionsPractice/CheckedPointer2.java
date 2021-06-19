package com.intertech.ExceptionsPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedPointer2 {
	public static void main(String[] args) {
		findMyFiles();
	}
	static void findMyFiles() {
		try {
			FileInputStream f = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
