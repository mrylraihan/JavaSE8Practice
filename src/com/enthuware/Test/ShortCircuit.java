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
	      bool = ( bool2 &  method1(i++) ); //increase by 1 because it checks both
	      bool = ( bool2 && method1(i++) ); //doesnt because it shortCircuits the evaluation
	      bool = ( bool1 |  method1(i++) ); //increase again by 1 because it checks both
	      bool = ( bool1 || method1(i++) ); //doesnt because it shortCircuits the evaluation
	      System.out.println(i);
	}

}
