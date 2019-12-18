
public class MaxMinSum {
	
	public static void main (String [] args) {
	int [] arr = {1,2,3,4,5};
	int sum = 0;
	
	for (int i = 0; i < arr.length - 1; i++) 
		sum = sum + arr[i];
	System.out.println("min sum = " + sum);
	
	sum = 0;
		
		for (int j = 1; j < arr.length; j++) 
			sum = sum + arr[j];
		System.out.println("max sum = " + sum);
		
		
	
	}
	

}
