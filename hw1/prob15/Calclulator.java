package com.revature.hw1.prob15;

public class Calclulator implements Calc {
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public void subract(int x, int y) {
		int z = x - y;
	}
	
	@Override
	public void multiply(int x, int y) {
		int z = x*y;
	}
	@Override
	public void divide(int x, int y) {
		int z = x/y;
	}

	
	
}
