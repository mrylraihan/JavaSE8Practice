package com.enthuware.Test;

public class ShortCircuit{
	public static boolean method1(int i) {
		return i>0? true :false;
	}
	
	public static void main(String[] args) {
		 int i = 0 ;
	      boolean bool1 = true ;
	      boolean bool2 = false;
	      boolean bool  = false;
	      bool = ( bool2 &  method1(i++) ); //Increase
	      bool = ( bool2 && method1(i++) ); //2
	      bool = ( bool1 |  method1(i++) ); //
	      bool = ( bool1 || method1(i++) ); //4
	      System.out.println(i);
	}

}
