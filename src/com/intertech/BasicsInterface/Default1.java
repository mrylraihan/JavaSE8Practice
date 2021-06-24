package com.intertech.BasicsInterface;

public interface Default1 {
	public default void yahoo() {
		System.out.println("yahoo default1");
	}
	//hahoo in both interfaces are different this one doesnt have a parameter and the
	//other ones does so that doesnt count as the same method signature
	public default void hahoo() {
		System.out.println("hahoo from default1");
	}
}
