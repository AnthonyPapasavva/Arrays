package com.qa.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int i = 12;
		Integer I = 24;
		ArrayList<Integer> nums = new ArrayList<>();

		for (int j = 0; j < 10; j++) {
			nums.add(j * j);
		}

		System.out.println(nums);
		for (int j = 0; j < nums.size(); j++) {
			System.out.println(nums.get(j));
		}
	}
}
