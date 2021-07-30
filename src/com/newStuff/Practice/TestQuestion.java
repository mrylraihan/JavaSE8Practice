package com.newStuff.Practice;

import java.util.HashSet;
import java.util.Set;

public class TestQuestion {
	
	public boolean twoSum(int[] nums, int target) {
		Set<Integer>set = new HashSet<>();
		for(int num :nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(target - num);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int [] numberList = {4,7,5,8};
		int target = 10;
		
		boolean answer = new TestQuestion().twoSum(numberList, target);
		System.out.println(answer);
		
	}
}
