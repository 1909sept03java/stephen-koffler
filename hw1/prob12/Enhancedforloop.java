package com.revature.hw1.prob12;
public class Enhancedforloop 
{ 
    public static void main(String args[]) 
    { 
        int[] arr = new int[100]; 
        
        for (int i = 0; i < 100; i++)
        	arr[i] = i + 1;
        
        for (int x:arr) {
        	if(x%2 == 0)
        	System.out.println(x);
        }
  
      
    } 
} 