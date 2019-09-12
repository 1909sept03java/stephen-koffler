package com.revature.hw1.prob19;
import java.util.*;

public class ArrayListOneToTen {
	static int sum1, sum2 = 0;

	public static void main(String[] args) {
		
		ArrayList<Integer> OneToTen = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
			OneToTen.add(i+1);
		
		for (int i = 0; i < 10; i++)
		System.out.println(OneToTen.get(i));
		
		for (int i = 0; i < 10; i++) {
			if (OneToTen.get(i)%2 == 0)
				sum1 = sum1+ OneToTen.get(i);
			else
				sum2 = sum2 + OneToTen.get(i);
			
			

			
		}
		System.out.println("sum of evens is " + sum1);
		System.out.println("sum of odss is " + sum2);
		
		OneToTen.remove(1);
		OneToTen.remove(1);
		OneToTen.remove(2);
		OneToTen.remove(3);
		
		for (int i = 0; i < 6; i++)
			System.out.println(OneToTen.get(i));

	}

}
