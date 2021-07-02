package com.enthuware.Test4;

public class BitwiseOperatorPractice {
	//Bitwise Operator -> And &, OR | its the single evalutaion operators
	//this will check both conditon's ands increment or decrement in both of them regardless if true or false
	//
	static int c;
	public static void main(String[] args) {
		
		int a = 1;
		int b = a++;
		if((a == ++b)&(a==b++)) {
			System.out.println("the bitwise operator checks both conditions");
			System.out.println(a);//2
			System.out.println(b);//3
		}else {
			System.out.println("it doesnt work the way i thought");
			System.out.println(a);//2
			System.out.println(b);//3
		}
		
		int d = ++c;//c becomes 1 and d becomes 1
		
		if((++d == c) | (++d == c)) {// d becomes 2 and c stays 1 | d then becomes 3 and c stays 1
			System.out.println("this bitwise operator work the way we think and checks both conditions");
			System.out.println(c);//1
			System.out.println(d);//3
		}else {
			System.out.println("doesnt work the way i thought");
			System.out.println(c);//1
			System.out.println(d);//3
		}
		
		if(a == 2) System.out.println("only ifs this will work");
		
		
		boolean inMinnepolis = false;
		boolean inSaintPaul = true;
		
		 if(inMinnepolis)
			 System.out.println("Hello from Mpls");
		 else if(inSaintPaul)
			 System.out.println("hello from Saint Paul");
		 else
			 System.out.println("Hello from somewhere");
		 	 System.out.println("..can we visit you in St Paul");// this is not part of the if statement 
		 	 //only the lines right below the conditionals are
		 	 
		
		
	}

}
