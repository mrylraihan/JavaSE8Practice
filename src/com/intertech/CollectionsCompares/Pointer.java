package com.intertech.CollectionsCompares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.intertech.CollectionsMapsPractice.MyDateEx;

public class Pointer {
	public static void main(String[] args) {

		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell xps13", "Windows", 16, 800));
		laps.add(new Laptop("Razor blade", "Windows", 32, 1000));
		laps.add(new Laptop("MacBook pro 13", "IOS", 16, 1400));
		laps.add(new Laptop("MacBook pro 16", "IOS", 32, 2400));

		Collections.sort(laps);
		System.out.println(laps);
		for (Laptop laptop : laps) {
			System.out.println(laptop);
		}

		List<MyDateEx> dates = new ArrayList<>();
		MyDateEx birthday = new MyDateEx(1, 01, 1991);
		MyDateEx anniv = new MyDateEx(8, 15, 2020);
		MyDateEx firstTrip = new MyDateEx(7, 19, 2021);
		MyDateEx taxDay = new MyDateEx(1, 1, 2021);
		dates.add(birthday);
		dates.add(taxDay);
		dates.add(firstTrip);
		dates.add(anniv);

		System.out.println(dates);
		Collections.sort(dates);
		System.out.println(dates);

		Comparator<Laptop> com = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getRam() > o2.getRam()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(laps, com);
		for (Laptop laptop : laps) {
			System.out.println(laptop);
		}
		System.out.println("--------->");
		
		
		List<Cats> catList = new ArrayList<>();
		catList.add(new Cats("Fluffy", "White", 2));
		catList.add(new Cats("Boots", "Oreo", 1));
		catList.add(new Cats("Korakot", "Brown", 22));
		catList.add(new Cats("Danny", "Black", 6));

		Collections.sort(catList);
		for (Cats cat : catList) {
			System.out.println(cat);
		}
		System.out.println("--------->");
		Comparator<Cats> listByAge = new Comparator<Cats>() {

			@Override
			public int compare(Cats o1, Cats o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				} else {
					return -1;
				}
			}

		};

		Collections.sort(catList, listByAge);
		for (Cats cat : catList) {
			System.out.println(cat);
		}
		System.out.println("--------->");

	}
}
