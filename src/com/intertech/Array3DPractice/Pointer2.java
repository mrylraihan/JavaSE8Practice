package com.intertech.Array3DPractice;

public class Pointer2 {

	public static void print3DArray(String[][]... a) {
		for (String[][] str : a) {
			for (String[] str2 : str) {
				for (String str3 : str2) {
					System.out.println(str3);
				}

			}
		}
	}
	public static void print3DArray(int[][]... a) {
		for (int[][] str : a) {
			for (int[] str2 : str) {
				if(!(str2 == null)) {
					for (int str3 : str2) {
						System.out.println(str3);
					}	
				}

			}
		}
	}

	public static void main(String[] args) {
		String[][] array = new String[3][2];
		array[0][0] = "Wallie";
		array[0][1] = "Hisham";
		array[1][0] = "Korakot";
		array[1][1] = "Garrett";
		array[2][0] = "Braxton";
		array[2][1] = "Nav";

		String[][][] array3D = new String[2][3][2];
		array3D[0][0][0] = "Wallie";
		array3D[0][0][1] = "Wayel";
		array3D[0][1][0] = "Whity";
		array3D[0][1][1] = "a";
		array3D[0][2][0] = "b";
		array3D[0][2][1] = "c";
		array3D[1][0][0] = "Wallie";
		array3D[1][0][1] = "Wayel";
		array3D[1][1][0] = "Whity";
		array3D[1][1][1] = "r";
		array3D[1][2][0] = "f";
		array3D[1][2][1] = "g";

		print3DArray(array3D);
		
		System.out.println("array3D len= "+ array3D.length);
		System.out.println("array3D[0] len= " + array3D[0].length);
		System.out.println("array3D[1] len= " + array3D[0][0].length);
		
		int[][][] moreStuff = new int[3][3][];
		moreStuff[0][2] = new int[2]; // Line A
		moreStuff[0][2][0] = 0;
		moreStuff[0][2][1] = 1;
		moreStuff[0][0]= new int[3];
		moreStuff[0][0][0] = 2;
		moreStuff[0][0][1] = 3;
		moreStuff[0][0][2] = 4;
		moreStuff[0][1] = new int[1];
		moreStuff[0][1][0] = 5;
		print3DArray(moreStuff);
		
	}

}
