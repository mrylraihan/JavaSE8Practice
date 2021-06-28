package com.intertech.StringBufBuildPractice;

import java.util.Arrays;

public class StringbbPointer {
	public static void main(String[] args) {
		String str = "Wallie";
		StringBuffer sbf = new StringBuffer();
		sbf.append("Wallie");
		System.out.println(sbf);

		StringBuilder sb = new StringBuilder();
		sb.append("Wallie");
		System.out.println(sbf.equals(sb));
		System.out.println(str.equals(sb));
		String[] strArr = {"W","A","Y","E","L"};
		StringBuilder name = new StringBuilder();
		String name1 = "";
		
		for ( String string : strArr) {
			name.append(string);
			name1 += string;
		}
		System.out.println(name);
		System.out.println(name);
		
		
		
	
	}
}
