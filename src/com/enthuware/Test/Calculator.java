package com.enthuware.Test;

abstract class Calculator {
	abstract void calculate();

	public static void main(String[] args) {
		System.out.println("calculate");
		Calculator x = null;
		x.calculate();
	}
}
