package com.java.tdd.fizzbuzzkata;

import junit.framework.TestCase;

/**
 * Unit test for FizzBuzzKata class to perform following logic
 * 
 * Write a program that prints one line for each number from 1 to 100
 * Usually just print the number itself.
 * For multiples of three print Fizz instead of the number
 * For the multiples of five print Buzz instead of the number
 * For numbers which are multiples of both three and five print FizzBuzz instead of the number.
 */

public class FizzBuzzKataTest extends TestCase
{
    /**
     *  Rigourous Test :-)
     *  
     */
    public void testApp()
    {
        assertEquals("1", FizzBuzzKata.convertToFizzBuzz(1));
        assertEquals("2", FizzBuzzKata.convertToFizzBuzz(2));
        assertEquals("Fizz", FizzBuzzKata.convertToFizzBuzz(3));
        assertEquals("Buzz", FizzBuzzKata.convertToFizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzzKata.convertToFizzBuzz(15));
        assertEquals("19", FizzBuzzKata.convertToFizzBuzz(19));
        assertEquals("Fizz", FizzBuzzKata.convertToFizzBuzz(21));
        assertEquals("22", FizzBuzzKata.convertToFizzBuzz(21));
        
    }
}
