package com.revature.hw1.prob6;

public class EvenOrOdd {

	public static void main(String[] args) {
		boolean even;
		int N = 16	;
		
		int M = N/2;
		
		int O = N - M*2;
		
		if (O == 0)
			even = true;
		else
			even = false;
		
		System.out.println(even);
			
		

	}

}
