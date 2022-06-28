package com.qa.arrays;

public class ArrayTutorial {

	public static void main(String[] args) {
		int[] array = new int[10];		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Number: " + i);
			array[i] = i;
		}
// (1) Create an array that will hold 10 integer values,
// populate the array with values, then call and output each element.	
		
		for (int j : array) {
			System.out.println(j + ": " + array[j] * 10);
		}

// (2) Create a for loop that populates an integer array with values, outputting them at each iteration.
// Then create another loop that iterates through the array, 
// changing the values at each point to equal itself times 10, outputting them at each iteration.
	
	}
}
