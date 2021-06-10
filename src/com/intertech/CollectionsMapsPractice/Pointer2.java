package com.intertech.CollectionsMapsPractice;

import java.util.HashMap;
import java.util.Map;

public class Pointer2 {
	public static void main(String[] args) {
		HashMap<String, Long> contacts = new HashMap<String, Long>();
		contacts.put("Hisham", 9176751559L);
		contacts.put("Wallie", 9172840945L);
		contacts.put("Garret", 4013232952L);
		contacts.put("Braxton", 6462251089L);
		System.out.println(contacts);
		System.out.println(contacts.get("Wallie"));
		System.out.println("---------->");
		contacts.forEach((n,p)->System.out.println(n+":"+ p));
		System.out.println("---------->");
		for(Map.Entry<String, Long> contactNums:contacts.entrySet()) {
			String key = contactNums.getKey();
			Long num = contactNums.getValue();
			System.out.println(key+"-"+num);
		}
	}
}
