package com.intertech.CollectionsQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePointer {
	public static void main(String[] args) {
		ArrayDeque<String> queueD = new ArrayDeque<String>();
		queueD.offerFirst("center");
		queueD.offerFirst("Bruce Banner");
		queueD.offerLast("Berry Allen");
		queueD.offerFirst("Bruce Wayne");
		queueD.offerLast("Clark Kent");
		queueD.offerFirst("Peter Parker");
		queueD.offerLast("Hal Jordan");
		System.out.println(queueD);
		System.out.println("-------------------->");
		System.out.println(queueD.pollFirst());
		System.out.println(queueD.pollLast());
		System.out.println(queueD);
		System.out.println(queueD.peekFirst());
		System.out.println(queueD.peekLast());
	}
}
