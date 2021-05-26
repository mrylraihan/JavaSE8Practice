package com.book.practice;

public class Lemur extends Primate implements HasTail{


	@Override
	public boolean isTailStriped() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int age = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		lemur.age = 11;
		Object objectLemur = lemur;
		Lemur lemur2 = (Lemur)objectLemur;
		System.out.println(lemur2.age);
		
		
		
	}

}
