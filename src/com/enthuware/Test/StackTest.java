package com.enthuware.Test;

import java.util.Stack;

public class StackTest {
	public static void processStacks(Stack x1, Stack x2) {
		x1.push(new Integer ("100"));
		x2 = x1;
	}
	public static void main(String[] args) {
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		processStacks(s1, s2);
		System.out.println(s1+ " "+s2);
	}

}
