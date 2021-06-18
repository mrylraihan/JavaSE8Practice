package com.intertech.ExceptionsPractice;

public class Pointer6 {
	public static void studyHours(int hours)throws OverStudyingException {
		if(8 < hours) {
			throw new OverStudyingException("Your studying for too long, take a break");
		}else {
			System.out.println("keep studying u havent done enough");
		}
	}
	public static void main(String[] args) throws OverStudyingException {
		studyHours(9);
	}
}
