package com.intertech.Basics;

public class ConcatenationOperator {
//	We've already seen the concatenation operator (+) and how it's used with Strings.  
//	But what happens when it's used with numeric primitives?
//
//	The rule is pretty simple: the + is treated as an addition operator until it is being
//	applied to a String.  From that point on, the + is treated as a String concatenation operator.
	
	
	public static void main(String[] args) {
		int employeeId = 2812;
		int deptId = 98;
		System.out.println(employeeId + deptId); // Prints 2910
		System.out.println(employeeId + ":" + deptId); // Prints 2812:98
		System.out.println(employeeId + deptId + ":" + employeeId + deptId); 
		// The line above prints 2910:281298
	}

}
