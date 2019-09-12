package com.revature.hw1.prob9;
import java.util.*;

public class Primesto100 {
	
	
	public static void main(String[] args) {
		boolean prime;
		ArrayList<Integer> firsthundred = new ArrayList<Integer>();
		
		for (int i = 1; i <101; i++)
			firsthundred.add(i);
	
		for (int i = 99; i >0; i--)
			for (int j = i - 1; j>0; j--) { 
				while (firsthundred.get(i)/firsthundred.get(j) != 0)
					int counter = 0;
				
				else
					break;
			}
		
		
/*			for (int i = 0; i <100; i++)
			System.out.println(firsthundred.get(i));*/
	}

}
