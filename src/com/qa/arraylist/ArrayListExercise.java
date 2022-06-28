package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		List<String> softdrinks = new ArrayList<>();

		softdrinks.add("7-Up");
		softdrinks.add("Coca-Cola");
		softdrinks.add("Pepsi");
		softdrinks.add("Sprite");
		softdrinks.add("Fanta");
		Collections.sort(softdrinks);
		System.out.println(softdrinks);

		for (String j : softdrinks) {
			System.out.println(j);
		}

		System.out.println(softdrinks.get(0));
		System.out.println(softdrinks.get(2));
		System.out.println(softdrinks.get(4));

		softdrinks.set(1, "Lilt");
		softdrinks.set(3, "Mirinda");
		Collections.sort(softdrinks);
		System.out.println(softdrinks);

		softdrinks.remove(2);
		System.out.println(softdrinks);

	}
}
//create a new ArrayList
//add() several elements
//print out the entire ArrayList
//iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
//get() specific elements
//set() different elements
//remove() elements
//sort() the ArrayList (try this with several object types)
//try using the reverse(), swap() and clear() methods.