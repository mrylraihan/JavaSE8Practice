package com.enthuware.Test4;

public class OverrdingStatic {
	 static String name;
	public static String whatsYourName(String s) {
		name = s;
		return s;
	}
	public static void main(String[] args) {
		OverrdingStatic os = new OverrdingStatic();
		OverrdingStatic.whatsYourName("Wallie");
		System.out.println(os.name);
		OverrdingStatic os2 = new OverrdingStatic();
		System.out.println(os2.name);
	
	}
}
class A extends OverrdingStatic{
	static String name;
	public static String whatsYourName(String s) {
		name = s;
		return s;
	}
}
