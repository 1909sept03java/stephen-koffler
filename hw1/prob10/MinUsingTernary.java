package com.revature.hw1.prob10;

public class MinUsingTernary {
	
	public static void main(String[] args) {
		
		int x = 4;
		int y = 3;
		
		final String msg = x > y
				  ? "y is the minimum value"
				  : "x is the minimum value";
		
		System.out.println(msg);
		
	}
}
