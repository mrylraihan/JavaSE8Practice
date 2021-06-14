package com.intertech.ExceptionsPractice;

import java.util.ArrayList;

public class Pointer1 {

	public static void main(String[] args) {
		String str = "A Char String";
		String nStr = null;
		try {

			System.out.println("Before problem");
			char ch = str.charAt(20);
			System.out.println(ch);
			System.out.println(nStr.charAt(20));
			System.out.println("After Problem");
		} catch (StringIndexOutOfBoundsException | NullPointerException e) {
			String longStr = str.concat("12345678909876");
			System.out.println(longStr.charAt(20));
			System.out.println("Hey - your string's not that big! so we added some more Characters or is null");

		}finally {
			System.out.println("we are in teh finally block");
		}
		
		//Another example of Exception handling
		try {
			System.out.println("Before problem part 2");
			char ch2 = str.charAt(5);
			System.out.println(ch2);
			System.out.println("After no problem");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Strings too short");
		}catch (NullPointerException e) {
			System.out.println("your variable is pointing to null");
		}finally {
			System.out.println("finally block part2 !");
		}
	}

}
