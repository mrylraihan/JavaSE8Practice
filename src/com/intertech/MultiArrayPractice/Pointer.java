package com.intertech.MultiArrayPractice;

import java.util.Iterator;

public class Pointer {
	public static void print2DArrayAgain(int[][] a) {
		for (int[] j : a) {
				for (int k : j) {
				System.out.println(k);
				}
				
		}
	}
	
	public static void print2DArray(int[][] a) {
		int i = 0;
		for (int[] j : a) {
				for (int[] k : a) {
				System.out.println(k[i]);
				}
				i++;
		}
	}
	
	public static void printSingleArray(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}

	}
	
	
	public static void main(String[] args) {
		int [][] lotteryTicket = {
				{10,2,13},
				{11,12,24},
				{9,7,2}
		};
		
		int [][] lotteryTicket2 = new int [2][2];
		lotteryTicket2[0][0] = 20;
		lotteryTicket2[0][1] = 21;
		lotteryTicket2[1][0] = 22;
		lotteryTicket2[1][1] = 22;
			
		int [] lotteryTicket3 = {2,3,4};
		
		print2DArray(lotteryTicket);
		printSingleArray(lotteryTicket3);

	}

}
