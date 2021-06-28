package com.enthuware.Test3;

public class UsingLoopConstructs {
	private int j;
	void showJ() {
		while(j<=5) {
			for(int j = 1; j <= 5;) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println(j+": outside forloop in while loop");
			j++;
		}
	}
	public static void main(String[] args) {
		new UsingLoopConstructs().showJ();
	}

}
