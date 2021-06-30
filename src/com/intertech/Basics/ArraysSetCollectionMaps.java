package com.intertech.Basics;

import java.util.ArrayDeque; // ArrayDeque imports
import java.util.ArrayList; // Arraylist imports
import java.util.Arrays; // Arrays imports
import java.util.Collections;// Collections import to use collection methods 
import java.util.HashMap; // HashMap imports
import java.util.HashSet; // Hashset import
import java.util.LinkedList; // Linkedlist imports
import java.util.PriorityQueue; // PriorityQueue imports
import java.util.TreeMap; // TreeMaps
import java.util.TreeSet; // TreeSet import
import java.util.concurrent.ArrayBlockingQueue; // ArrayBlockingQueue imports

public class ArraysSetCollectionMaps {
	public static void main(String[] args) {
		//Arrays
		int nums[] = {1,2,3};//Arrays imports needed
		
		int nums1[] = new int[10];// how to instantiate an array
		
		char[] letters = {'d', 'a', 'b', 'x', 'c', 'y', 'w'};//Arrays imports needed\
		
		String[] letter1 = {"Wayel", "Sahi", "Hisham"};
		
		
		//Arrays. is for arrays
		System.out.println(Arrays.toString(nums));// for primitives 
		Arrays.sort(letters);
		System.out.println(Arrays.toString(letters));// for primitives
		System.out.println(Arrays.deepToString(letter1));// deepToString is for objects
		
		System.out.println("-------------------------------------------------->");
		
		//Arraylist - List 
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Wayel");
		list2.add("Raihan");
		Collections.sort(list2);
		System.out.println(list2);
		
		//LinkedList - List 
		
		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("a");
		list3.add("c");
		list3.add("b");
		Collections.sort(list3);
		System.out.println(list3);
		
		//HashSet - Set
		
		HashSet<String> salesRegion = new HashSet<String>();
		//add all valid sale regions
		salesRegion.add("Minnesota");
		salesRegion.add("New York");
		salesRegion.add("New Jersey");
		salesRegion.add("Maryland");
		salesRegion.add("Minnesota");
		salesRegion.add("New York");//because it is a duplicate it will be silently ignored
		System.out.println(salesRegion);
		
		//TreeSet - Set 
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(2);
		tree.add(100);
		tree.add(77);
		tree.add(34);
		tree.add(100);
		// Tree set Automatically sorts the elements
		System.out.println(tree);
		
		//ArrayBlockingQueue- Queue
		ArrayBlockingQueue<String> queueq1 = new ArrayBlockingQueue<String>(5);
		queueq1.add("Wallie");
		queueq1.add("Hisham");
		queueq1.add("Moe");
		queueq1.add("Mike");
		queueq1.add("Ryan");
		System.out.println(queueq1);
		
		//ArrayDeque - Queue
		ArrayDeque<String> queueD = new ArrayDeque<String>();
		queueD.offerFirst("center");
		queueD.offerFirst("Bruce Banner");
		queueD.offerLast("Berry Allen");
		queueD.offerFirst("Bruce Wayne");
		queueD.offerLast("Clark Kent");
		queueD.offerFirst("Peter Parker");
		queueD.offerLast("Hal Jordan");
		System.out.println(queueD);
		
		//PriorityQueue - Queue
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("2");
		queue.offer("Wallie");
		queue.offer("Hisham");
		queue.offer("Mike");
		queue.offer("Korakot");
		queue.offer("Tarzan");
		queue.offer("Braxton");
		System.out.println(queue);
		
		//HashMap - maps
		HashMap<String, Integer> hMaps = new HashMap<String, Integer>();
		hMaps.put("a", 1);
		hMaps.put("b", 2);
		hMaps.put("c", 3);
		System.out.println(hMaps);
		
		//TreeMap - maps
		TreeMap<String, Integer> listNums = new TreeMap<String, Integer>();
		listNums.put("Hihsam", 915);
		listNums.put("Wayel", 919);
		listNums.put("Sam", 916);
		listNums.put("Korakot", 917);
		listNums.put("Garret", 918);
		listNums.put("wally", 1000);
		listNums.put("4",8);
		System.out.println(listNums);
		
	}
}
