package com.enthuware.Test5;

import java.util.Scanner;

public class NameStuff {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		
		System.out.println("Hello " + name + " the length of your name is "+ name.length());
	}

}
