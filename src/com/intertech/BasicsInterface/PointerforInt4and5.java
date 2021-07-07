package com.intertech.BasicsInterface;

public class PointerforInt4and5 extends ParentPointer implements Interface6 {
	
	PointerforInt4and5(){
		System.out.println("constructor in child");
		System.out.println("------------------------>");
	}
	public static void main(String[] args) {
		PointerforInt4and5 pt = new PointerforInt4and5();
		ParentPointer pp = new ParentPointer();
		
		ParentPointer ppt = new PointerforInt4and5();
		pp.defaultM();
		pt.defaultM();
		
		
		pp = pt;
		pt = (PointerforInt4and5) pp;
		
		Interface6 it6 = new PointerforInt4and5();
		Interface6.heythere();
		System.out.println(it6.stuff);
		
		
		Interface5 say = () -> System.out.println("hey dude lambda1");
		say.sayName();
		Interface5.heythere();

		Interface4 say1 = () -> System.out.println("hey dude again lambda2");
		Interface4.heythere();
		say1.sayName();
		
		System.out.println(5<5);
	}

}
