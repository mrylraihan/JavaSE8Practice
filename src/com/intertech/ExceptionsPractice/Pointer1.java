package com.intertech.ExceptionsPractice;

import java.util.ArrayList;

public class Pointer1 {

	public static void main(String[] args) {
		String str = "A Char String";
		String nStr = null;
		try {

			System.out.println("Before problem");
			System.out.println(str.charAt(20));
			System.out.println(nStr.charAt(20));
			System.out.println("After Problem");
		} catch (StringIndexOutOfBoundsException | NullPointerException e) {
			String longStr = str.concat("12345678909876");
			System.out.println(longStr.charAt(20));
			System.out.println("Hey - your string's not that big! so we added some more Characters or is null");

		}
	}

}
