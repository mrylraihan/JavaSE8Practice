package com.book.practice2;

public class Capybara extends Rodent {
	int cAge = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Rodent rodent = new Rodent();
//		Capybara capybara = (Capybara)rodent;
		//this one wont compile and we will get a cast class exception 
		//below is the proper way to do it if you dont want a class cast exception 
		Rodent rodent = new Rodent();
		if(rodent instanceof Capybara) {
			Capybara capybara = (Capybara)rodent;
		}
		System.out.println(rodent instanceof Capybara);
		
		Rodent rodent2 = new Capybara();
		Capybara capybara2 = (Capybara)rodent2;
		
		System.out.println(capybara2.cAge);
		
		Rodent rodent3 = new Capybara();
	
		System.out.println(((Capybara)rodent3).cAge = 11);
		
		

	}

}
