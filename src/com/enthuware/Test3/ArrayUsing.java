package com.enthuware.Test3;

public class ArrayUsing {
	public static void main(String[] args) {
		int i = 0;
		int[] iA = {10,20};
		iA[i] = i = 30;
		System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i);
	}
}
