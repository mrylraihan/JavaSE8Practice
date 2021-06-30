package com.intertech.Basics;

public class staticVM {
	static String name;// Static variable

	String name1 = "Wallie"; // instance variable

	public String peoplesNames(String a) {

		String name3 = a;
		return name3;
	}

	public static void main(String[] args) {
		String name2 = "Mike";// local variable
		System.out.println(name2);
		System.out.println(name);
//		System.out.println(name1); this wont compile because in order to 
		// use name1 we need to create an instance of the class
		staticVM svm = new staticVM();
		System.out.println(svm.name1);
		// now we can use the instance variable because we created an instance of the
		// class
		System.out.println(staticVM.name);// another way to call a static variable by using
		// the name of the class

		String hisName = svm.peoplesNames("Garrett");
		System.out.println(hisName);
	}

}
