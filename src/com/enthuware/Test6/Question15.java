package com.enthuware.Test6;

public class Question15 {
	int k = 5;
	public boolean checkIt(int k) {
		return k-- > 0 ? true : false;
	}
	public void printThem() {
		while(checkIt(k)) {
			System.out.println(k--);
		}
	}
	public static void main(String[] args) {
		new Question15().printThem();
	}
}
