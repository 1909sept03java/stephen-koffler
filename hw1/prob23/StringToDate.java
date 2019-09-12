package com.revature.hw1.prob23;

public class StringToDate {
	static String eightnumbers = "12021978";
	static char [] dated = new char[10];
	static String asdate = "";
	
	public static void main(String[] args) {
		
		dated[0] = eightnumbers.charAt(0);
		dated[1] = eightnumbers.charAt(1);
		dated[2] = '/';
		dated[3] = eightnumbers.charAt(2);
		dated[4] = eightnumbers.charAt(3);
		dated[5] = '/';
		dated[6] = eightnumbers.charAt(4);
		dated[7] = eightnumbers.charAt(5);
		dated[8] = eightnumbers.charAt(6);
		dated[9] = eightnumbers.charAt(7);
		
		for (int i = 0; i <8; i++) 
			asdate = asdate + dated[i];
		
		
		System.out.println(asdate);
		
		
	}

}
