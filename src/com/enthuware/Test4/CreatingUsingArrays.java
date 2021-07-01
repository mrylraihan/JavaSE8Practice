package com.enthuware.Test4;

public class CreatingUsingArrays {
	public static void main(String[] args) {
		double daaa[][][] = new double [3][][];
		double d = 100.0;
		double[][] daa = new double[1][1];
		
		daaa[0] = daa;
		daa = daaa[0];
		
		System.out.println(null +" "+ true );
		System.out.println(null +" "+ null);
		System.out.println(true +" "+ null);


	}

}
