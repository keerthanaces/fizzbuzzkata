package com.java.tdd.fizzbuzzkata;

/**
 * FizzBuzzKata class performs following logic Write a program that prints one
 * line for each number from 1 to 100 Usually just print the number itself. For
 * multiples of three print Fizz instead of the number For the multiples of five
 * print Buzz instead of the number For numbers which are multiples of both
 * three and five print FizzBuzz instead of the number
 */

public class FizzBuzzKata {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(convertToFizzBuzz(i));
		}
	}

	/**
	 * convertToFizzBuzz method handle logic for FizzBuzzKata program.
	 * 
	 * @param convertFizzBuzzValue
	 * @return convertedFizzBuzzValue
	 */
	public static String convertToFizzBuzz(int convertFizzBuzzValue) {
		if (convertFizzBuzzValue % 3 == 0 && convertFizzBuzzValue % 5 == 0) {
			return "FizzBuzz";
		} else if (convertFizzBuzzValue % 3 == 0) {
			return "Fizz";
		} else if (convertFizzBuzzValue % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(convertFizzBuzzValue);
		}
	}

}
