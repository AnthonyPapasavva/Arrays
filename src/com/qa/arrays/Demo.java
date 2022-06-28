package com.qa.arrays;

public class Demo {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f' };
		System.out.println("0: " + letters[0]);
		letters[0] = 'a';
		System.out.println("0: " + letters[0]);
		System.out.println("Len: " + letters.length);
//		letters [6] = 'g'; CANNOT ASSIGN/ACCESS A VALUE GREATER THAN THE LAST INDEX

		for (int i = 0; i < letters.length; i++) {
			System.out.println(i + ": " + letters[i]);
		}

		for (char letter : letters) {
			System.out.println(letter);
// 		ENHANCED FOR LOOP ^ THIS IS NOT REALLY USED JUST BECAUSE A COMMON CASE USE
		}

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * i;
		}
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			System.out.println(i + ": " + num);
		}

	}

}
