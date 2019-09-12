package com.revature.hw1.prob3;

public class ReverseString {
	static String str;
	static String rvdstr = "";

	public static void main(String[] args) {
		
		str = "ABCDEFG";
		
		for (int i = str.length() - 1; i > -1; i--)
		rvdstr = rvdstr + str.charAt(i);
		
		System.out.println(rvdstr);
		
		

	}

}
