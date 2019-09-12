package com.revature.hw1.prob17;
import java.util.*;

public class SimpleInterest {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Principal");
		int p = scanner.nextInt();
		System.out.println("Enter Rate of Interest as decimal number (ie 6% = 0.06):");
		double i = scanner.nextDouble();
		System.out.println("Enter period in years (i.e. 12 years)");
		int pd = scanner.nextInt();
		
		double futval = p*(1+10*i);
		
		System.out.println(futval);
		
	}
		
			
			
			
			

	

	
	

}
