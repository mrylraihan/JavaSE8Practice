package com.intertech.payments;

public class PayService{
	public static double cutCheck(Payable p) {
		double gross = p.pay();
		return gross;
//		if(!(e instanceof Manager)) {
//			System.out.println("Good work teams");
//		}
	}

	public static void main(String[] args) {

		Manager m = new Manager();
		System.out.println("Managers pay:" +cutCheck(m));
//		System.out.println( m.pay());
		Instructor i = new Instructor();
		System.out.println("Instructors pay:" +cutCheck(i));
//		System.out.println("Instructors pay:" + i.pay());
		Programmer p = new Programmer();
		System.out.println("Programmer pay:" +cutCheck(p));
//		System.out.println("Programmers pay:" + p.pay());
		techWriter tw = new techWriter();
		System.out.println("TechWriter pay:" +cutCheck(tw));
//		System.out.println("techWriters pay:"+ tw.pay());
			

	}
}
