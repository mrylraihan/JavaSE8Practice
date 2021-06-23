package com.enthuware.Test;

class ABCD {
	int x = 10;
	static int y = 20;
}

class MNOP extends ABCD {
	int x = 30;
	static int y = 40;
}

public class Pointer1 {
	public static void main(String[] args) {
		System.out.println(new MNOP().x + "," + new MNOP().y);

		String s = "MINIMUM";
		
		System.out.println(s.substring(4, 7));// no index outofbounds
		// because it stops at index 7 and will take the element before which is 6
	}
}
