package com.revature.hw1.prob4;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		
		int M = 5;
	
		int N = (M - 1);
		
		while (N > 0) {
			M = M*N;
			N--;
			}
		
		System.out.println(M);
		} 
	
}
