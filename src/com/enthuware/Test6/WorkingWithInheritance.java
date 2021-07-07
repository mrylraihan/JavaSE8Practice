package com.enthuware.Test6;
class Super{
	static String ID = "QBANK";
}

class sub extends Super{
	static {
		System.out.println("in Sub");
	}
}
public class WorkingWithInheritance {
	public static void main(String[] args) {
	System.out.println(sub.ID);
	}
}
