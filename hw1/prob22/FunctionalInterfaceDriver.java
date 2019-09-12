package com.revature.hw1.prob22;

public class FunctionalInterfaceDriver {
	int x;
	int y;
	

	public static void main(String[] args) {
		 FunctionalInterface fIobj = (int x, int y)->System.out.println(y*x); 
		  
	        fIobj.abstractFunction(5, 6);     

	}

}
