package com.enthuware.Test6;

public class UsingLoops {
	public void ifTest(boolean flag){
		   if (flag)   //1
		   if (flag)   //2
		   System.out.println("True False");
		   else        // 3
		   System.out.println("True True");
		   else        // 4
		   System.out.println("False False");
		}
	public static void main(String args[]) {
		int c = 0;
		A: for (int i = 0; i < 4; i++) {
			B: for (int j = 0; j < 2; j++) {
				C: for (int k = 0; k < 3; k++) {
					c++;
					if (k > j)
						break;
				}
			}
		}
		System.out.println(c);
		
		System.out.println("-------------------->");
		
		UsingLoops ul = new UsingLoops();
		ul.ifTest(true);
	}
}
