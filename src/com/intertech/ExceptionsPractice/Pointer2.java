package com.intertech.ExceptionsPractice;

public class Pointer2 {
	public static void main(String[] args) {

		int[] numlist = { 1, 2, 3, 4, 5 };
		System.out.println(numlist[1]);
		try {
			System.out.println("before problem");
			System.out.println(numlist[8]);
			System.out.println("after problem");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("your index is too far!!!");
		}finally {
			System.out.println("in the finally block");
		}
		System.out.println("----------------------->");
		try {
			
			String str = "Hello World";
			int str1 = str.charAt(13);
			System.out.println(str1);
			numlist[5] = 8;
			String n = null;
			System.out.println(n.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("sorry your array doesnt have that index avaliable");
			e.printStackTrace();
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("your in the StringIndex pointer exception");
			System.out.println("StringIndexExcep "+e.getCause());
		} catch (NullPointerException e) {
			System.out.println("you in the nullpointer exception");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(" your in the last catch block");
			e.printStackTrace();
		}finally {
			System.out.println("your in the finally block");
		}
	}
}
