package com.intertech.dynamicMethodDispatching;

public class MainforParentAndChild {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c = (Child) p;
//		System.err.println(c.name); this wont work because the original
		//object of p is of Parent not child, you can only cast to 
		//subclass if the object is of that subclass
		
		Parent p = new Child();
		p.saySomething();//only uses the overridden method in the child class
		Child c = (Child) p;
		c.saySomething();//only has access to its own overridden method
		System.err.println(c.name);
		
	
		
		
	}
}
