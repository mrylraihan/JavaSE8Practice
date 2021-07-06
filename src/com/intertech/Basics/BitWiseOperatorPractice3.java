package com.intertech.Basics;

public class BitWiseOperatorPractice3 {
	public boolean isSleeping() {
		System.out.println("isSleeping()");
		return false;
	}

	public boolean isHome() {
		System.out.println("isHome()");
		return true;
	}

	public void boolA() {
		if (isSleeping() & isHome()) {
			System.out.println("BoolA: shhh ... wallie is sleeping");
		}
	}
	
	public void boolB() {
		if (isSleeping() && isHome()) {
			System.out.println("BoolA: shhh ... wallie is sleeping");
		}
	}
	
	public static void main(String[] args) {
		BitWiseOperatorPractice3 bt = new BitWiseOperatorPractice3();
		System.out.println("boolA is the single and & so it doesnt shortcircut the evaluation it checks both conditions");
		bt.boolA();
		System.out.println("---------------->");
		System.out.println("boolB is the double and && it does short circut the evaluation and only checks the first one and only moves on if its true");
		bt.boolB();
		System.out.println("------------------------>");
		int a = 1;
		int b = a++;
		if((a == b)&(a==b++)) {
			System.out.println("the bitwise operator checks both conditions");
			System.out.println(a);//2
			System.out.println(b);//2
		}else {
			System.out.println("Even if the first condtion is false the second conditon still gets evaluated");
			System.out.println(a);//2
			System.out.println(b);//2
		}
		System.out.println("---------------------->");
		
		int x = 1;
		int y = x++;
		if((x == y)&&(x==y++)) {
			System.out.println("the bitwise operator checks both conditions");
			System.out.println(x);//2
			System.out.println(y);//1
		}else {
			System.out.println("the second condtion doesnt get evalutaed because it gets short circuited");
			System.out.println(x);//2
			System.out.println(y);//1
		}
		System.out.println("---------------------->");
	}

}
