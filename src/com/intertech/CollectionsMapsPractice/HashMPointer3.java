package com.intertech.CollectionsMapsPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMPointer3 {
	public static void main(String[] args) {
		Map<String, MyDateEx> map = new HashMap();
		MyDateEx birthday = new MyDateEx(1, 01, 1991);
		MyDateEx anniv = new MyDateEx(8, 15, 2020);
		MyDateEx firstTrip = new MyDateEx(7, 19, 2021);
		MyDateEx taxDay = new MyDateEx(1, 1, 2021);
		map.put("Birthday", birthday);
		map.put("Anniv", anniv);
		map.put("FirstTrip", firstTrip);
		map.put("TaxDay", taxDay);

		MyDateEx d = (MyDateEx) map.get("Birthday");
		System.out.println(d);
		map.remove("TaxDay");

		System.out.println(map);
		if (map.containsValue(anniv)) {
			System.out.println("the map has the value of my anniversy");
		}
		if (map.containsKey("Birthday")) {
			System.out.println("my birthday is a key in the map");
		}
		System.out.println("----------------->");
		// how to print all the keys
		Set s = map.keySet();
		System.out.println(s);
		System.out.println("----------------->");
		Collection v = map.values();
		System.out.println(v);

		map.forEach((k, a) -> System.out.println(k + ":" + a));


	}
}
