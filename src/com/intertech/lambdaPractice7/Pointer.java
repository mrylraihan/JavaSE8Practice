package com.intertech.lambdaPractice7;

public class Pointer {

	public static void whatsAnOverLoadedmethod() {

	}

	public static void whatsAnOverLoadedmethod(String a) {

	}

	public static void whatsAnOverLoadedmethod(String a, String b) {

	}

	public static void whatsAnOverLoadedmethod(int a) {

	}

	public static void main(String[] args) {

		Functional1 lambdaPeramater = a -> System.out.println(a);
		lambdaPeramater.sayHI("Hello");
//	lambdaPeramater.myName(); wont work
		Functional1.myName();

		Functional2 lambdaReturn = () -> {
			return "Bye";
		};
		System.out.println(lambdaReturn.saybye());

		whatsAnOverLoadedmethod(null);

	}
}