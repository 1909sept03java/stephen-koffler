package com.revature.intro;

public class MInimumMutations {
	
	static String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
	
		public static void validMutation(String end) {
			boolean valid = false;
			boolean thisWordMathces = true;

			for (int i = 0; i < bank.length - 1; i++) {
				for (int j = 0; j < bank[i].length() - 1; j++) {
					 
					while (bank[i].charAt(j) == end.charAt(j))
						valid = true;
						System.out.println(valid);
				}
			}
		
			
	}
		public static boolean startMatchesEnd(String start, String end) {
				boolean matches = true;
				while (matches == true) {
				for (int i = 0; i < start.length() - 1; i++)
					if (start.charAt(i) == end.charAt(i))
						matches = true;
					else matches = false;
				}
			return matches;
		}
	
	
	
	
	
	

	public static void main(String[] args) {
		String start =  "AACCGGTT";
		String end =  "AAACGGTA";
	
		validMutation(end);
		
	}

}
