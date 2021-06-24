package com.intertech.BasicsInterface;

public interface Default2 {
	public default void yahoo() {
		System.out.println("yahoo default2");
	}
	//hahoo in both interfaces are different this one does have a parameter and the
	//other ones doesnt so that doesnt count as the same method signature
	public default void hahoo(String n) {
		System.out.println("hahoo from default1");
	}

}
