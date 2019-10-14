package com.revature;

public class CountingValleys {
	int level = 0;
	
	public int countValleys(int n, String s) {
		int valley = 0;
		for (int x = 0; x < s.length(); x++) {
			if (s.charAt(x) == 'D')
				level--;
			else
				level++;
			if (level == -2 && s.charAt(x) == 'D' && s.charAt(x-1) == 'D')
					valley++;
		}
		return valley;
	}
	
	
	
	

	public static void main(String[] args) {
		CountingValleys cv = new CountingValleys();
		System.out.println(cv.countValleys("DDDDUDUDDUUDUUUUDDUU", 16));

	}

}
