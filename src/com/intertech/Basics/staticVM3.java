package com.intertech.Basics;

public class staticVM3 {
	String firstName;
	static String lastName;
	static String SirName;

	public void settingNames(String a, String b) {
		firstName = a;
		lastName = b;
		//instance methods have access two both static and non static methods
	}
	static void settingSirNames(String c) {
		SirName = c;
		//Static methods dont have access to non static variables
	}
	@Override
	public String toString() {

		return (SirName+"."+firstName +" "+lastName);
	}

	public static void main(String[] args) {
		staticVM3 smv = new staticVM3();
		staticVM3 smv1 = new staticVM3();
		smv1.settingNames("Shajan", "Abu");
		smv.settingNames("Wallie", "Raihan");
		System.out.println("firstName : " + smv.firstName);//instance variable
		System.out.println("LastName :"+ lastName );//static variable
		staticVM3.settingSirNames("Mr");
		System.out.println(staticVM3.SirName);
		System.out.println(smv);
		smv1.settingSirNames("Ms");
		System.out.println(smv1);

	}
}
