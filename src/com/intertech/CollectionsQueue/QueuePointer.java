package com.intertech.CollectionsQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class QueuePointer {
	public static void main(String[] args) {
//		ArrayBlockingQueue queueq1 = new ArrayBlockingQueue(5);
		ArrayBlockingQueue<String> queueq1 = new ArrayBlockingQueue<String>(5);
		queueq1.add("Wallie");
		queueq1.add("Hisham");
		queueq1.add("Moe");
		queueq1.add("Mike");
		queueq1.add("Ryan");
		System.out.println(queueq1);
		String firstName = queueq1.poll();
		System.out.println(queueq1);
		String nextName = queueq1.peek();
		System.out.println(firstName);
		System.out.println(nextName);
		ArrayBlockingQueue queueq2 = new ArrayBlockingQueue(3);		
		queueq2.add("mike");
		queueq2.offer("moe");
		queueq2.offer("wayel");
		queueq2.offer("heshow");
		System.out.println(queueq2);
	}
}
