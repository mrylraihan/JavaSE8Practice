package com.intertech.BasicsInterface;

public class TestDefault implements Default1, Default2{
//we must override one of the defaulted method in on interface because they have the same method signature
	@Override
	public void yahoo() {
		// TODO Auto-generated method stub
		Default1.super.yahoo();
		Default2.super.yahoo();
		System.out.println("yahoo TestDefault");
	}
	

	public static void main(String[] args) {
		TestDefault td = new TestDefault();
		td.yahoo();
		td.hahoo();//with out parameter
		td.hahoo(null);//with parameter
	}

}