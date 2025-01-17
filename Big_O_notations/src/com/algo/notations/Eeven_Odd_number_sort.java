package com.algo.notations;

import java.util.ArrayList;

public class Eeven_Odd_number_sort {
	
	static ArrayList<Integer> odd_numbers = new ArrayList<Integer>();
	static ArrayList<Integer> even_numbers = new ArrayList<Integer>();
	//System.out.println(even_numbers.get(0));	
	
	static int value = 0;
	static ArrayList<Integer> numbers = new ArrayList<Integer>(); // only static accessible out side of main method.
	
	public static void main(String[] args) {

		numbers.add(0, 0);  /* here you need to add in main method as execution needed here*/
		numbers.add(1, 1);
		numbers.add(2, 2);
		numbers.add(3, 3);
		numbers.add(4, 4);
		numbers.add(5, 5);
		numbers.add(6, 6);
		numbers.add(7, 7);
		numbers.add(8, 8);
		numbers.add(9, 9);
		numbers.add(10, 10);
		
		
		for(int i = 0; i< numbers.size(); i++) {
			//System.out.println(numbers.get(i));
		     value = numbers.get(i);
		     
		     if( value % 2  == 0) {
			    System.out.println("loop is running "+value);
						even_numbers.add(i);
	        } if(value % 2 != 0){
				 		odd_numbers.add(i);

	        }
        }
	
		get_even_number();
		get_odd_number();
	}

	private static void get_odd_number() {
		System.out.println(odd_numbers);
		
	}

	private static void get_even_number() {
		System.out.println(even_numbers);
	}
		
		
	}

