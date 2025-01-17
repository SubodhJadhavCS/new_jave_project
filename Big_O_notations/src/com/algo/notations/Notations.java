package com.algo.notations;

public interface Notations {

	default void saysomething() {
	  executebyself();	
	}
	
	public static void executebyself() {
		
		
	}

	public void Generate_code();

	public static  int calculate() {
		int value = 0;
		int A = 2;
		int B = 3;

		value = A * B;

		Execute_Next_Method();
		return value;
		
	}

	private static void Execute_Next_Method() {
		//we need to make it static 
		System.out.println("this method is private");
	}

	
	
}
