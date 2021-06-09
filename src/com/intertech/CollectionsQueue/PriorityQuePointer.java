package com.intertech.CollectionsQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQuePointer {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("2");
		queue.offer("Wallie");
		queue.offer("Hisham");
		queue.offer("Mike");
		queue.offer("Korakot");
		queue.offer("Tarzan");
		queue.offer("Braxton");
		
		System.out.println(queue);
		
		String nextName = queue.poll();
		System.out.println(nextName);
		nextName = queue.poll();
		System.out.println(nextName);
		nextName = queue.poll();
		System.out.println(nextName);
		nextName = queue.poll();
		System.out.println(nextName);
		nextName = queue.poll();
		System.out.println(nextName);
		System.out.println(queue);
		
		
	}

}
