//**************************************************************************************************************
//
//  EvenNumSum.java		Author: Fischer
//
//  Asks user to input an integer greater than one. Prints the sum of all even integers between
//  2 and the user input integer (inclusive).  Prints an error message if user inputs integer less than 2 and 
//  prompt user to enter another number.
//**************************************************************************************************************
import java.util.Scanner;
import java.util.stream.*;

import java.util.List;

import java.util.ArrayList;
public class EvenNumSum {

/* Exercise 2
Design and implement an application that reads an integer value and prints the sum 
of all even integers between 2 and the input value, inclusive. Print an error message if the input 
value is less than 2 and have the user reenter the number. Prompt accordingly. Call this EvenNumSum.java
Exercise */
	public static void main(String[] args) {
		int integer;
		
		int even_sum;
		
		
		
		Scanner scan = new Scanner(System.in);
		
			
		
		
		System.out.print("Please enter a whole number larger than 1.  ");
		integer = scan.nextInt();
	while (integer != 2) {
		if (integer < 2) {
			System.out.println("Please read directions and try again. \nPlease enter a whole number larger than 1. ");
			integer = scan.nextInt();}
		if (integer > 2) {
			{IntStream stream = IntStream.range(2, integer);		
			break;}
			}}
	
		

List<Integer> ints = IntStream.range(2, integer)
		.boxed()
		.collect(Collectors.toList());

System.out.println(ints);

List<Integer> evens = new ArrayList<Integer>();
for (int i : ints) {
	if (i % 2 == 0)
		evens.add(i);
System.out.println(evens);

		
		
}}
	
	
	
