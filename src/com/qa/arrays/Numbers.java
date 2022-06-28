package com.qa.arrays;

public class Numbers {

	public static void main(String[] args) {
		System.out.println(addDigits(74));
		System.out.println(addDigits(49));
		System.out.println(addDigits(52));
		
		System.out.println(numberToWords(4));
		System.out.println(numberToWords(14));
		System.out.println(numberToWords(24));
		System.out.println(numberToWords(74));
		System.out.println(numberToWords(111));
		System.out.println(numberToWords(122));
		System.out.println(numberToWords(174));
	}
	
	public static String [] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static String [] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	{
	int num1 = 74;
	System.out.println("Sum of all parts = " + ((num1 / 10) + (num1 % 10)));	
	
	} // This is one way to do it in a single (or very few) lines.
	
	public static int addDigits(int num) {
		int firstDigit = num / 10;
		int secondDigit = num % 10;
		return firstDigit + secondDigit;
	}
// (1) Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
	
	public static String numberToWords(int num) {
		String output = "";
		
		if (num > 99) {
			int hundreds = num / 100;
			output += units[hundreds] + " hundred";
			num %= 100;
			if (num > 0) {
				output += " and ";
			}
		}
		int firstDigit = num /10;
		int secondDigit = num % 10;
		if (num < 20){
			output += units[num];
		} else {
		
		output += tens[firstDigit];
		output += "-";
		output += units[secondDigit];
		}
		
		return output; 
	}
	
//	(2) Create a second method that when given the number 1-99 returns a String representation 
//	of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//	(3) Expand on the method you wrote in step 2 to allow the input 1-999.
//	(4) Expand the method you wrote in step 2 to allow the input 1-9999.
//	(5) Use a for()-loop to print the numbers 1-100 in words.
//		For example; 1 = one, 100 = one hundred.

}
