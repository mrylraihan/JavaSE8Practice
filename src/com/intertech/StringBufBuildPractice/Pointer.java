package com.intertech.StringBufBuildPractice;

//StringBuffer and StringBuilder both are used for String mutability 
public class Pointer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(5);
		sb.append("Helloooooooo");
		System.out.println(sb);
		sb.replace(0, 1, "W");
		System.out.println(sb);
		sb.delete(5,sb.length());
		System.out.println(sb);
		
		StringBuilder sbb = new StringBuilder();
		sbb.append("StringBuffer");
		System.out.println(sbb);
		int r = sbb.indexOf("r",4);
		sbb.replace(r,++r, "W");
		System.out.println(sbb);
	}

}
