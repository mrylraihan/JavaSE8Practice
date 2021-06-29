package com.enthuware.Test4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApi {

	public static void main(String[] args) {
		List s1 = new ArrayList();
		try {
			while (true) {
				s1.add("sdfa");
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println(s1.size());
	}
}
