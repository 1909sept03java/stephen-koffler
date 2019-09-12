package com.revature.hw1.prob1;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] arr = {1,0,5,6,3,2,3,7,9,8,4};
		
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < (11 -i-1); j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
				}
			}
		}for (int i = 0; i <11; i++)
			System.out.println(arr[i]);
		}
		
		 
	  

}
