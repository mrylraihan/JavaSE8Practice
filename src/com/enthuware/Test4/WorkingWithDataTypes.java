package com.enthuware.Test4;

public class WorkingWithDataTypes {
	String a = "x";
	static char b = 'x';
	String c = "x";
	public void sayHI() {
		System.out.println("say hi");
	}
		class Inner{
			String a = "y";
			String get() {
				String c = "temp";
				//Line 1
				c = ""+ WorkingWithDataTypes.b;
				c= WorkingWithDataTypes.this.a;
				c = ""+b;
				return c;
			}
		}
		WorkingWithDataTypes(){
			System.out.println( new Inner().get());
		}
		public static void main(String[] args) {
			new WorkingWithDataTypes();
		}
		

}
