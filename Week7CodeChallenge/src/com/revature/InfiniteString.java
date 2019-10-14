package com.revature;

public class InfiniteString {
	
	long repeatedString(String s, long n) {
	    
	    int stubLength;
	    int aSPerS; //number a's in string s
	    int nbrFullStrings;
	    int aSInStub;
	    int counterFull = 0;//counts the number of a's in string s
	    int counterStub = 0;//counts the number of a's in stub of s
	    long TotalAs;
	    
	    if(s=="a")
	    	return n;
	    else {
	    for(int x=0; x <s.length(); x++) {
	    	if (s.charAt(x) == 'a')
	    		counterFull++;
	    }
	    
	    aSPerS = counterFull;
	    
	    nbrFullStrings = (int) n/s.length();
	    stubLength = (int) n%s.length();
	    
	    for(int x=0; x <stubLength; x++) {
	    	if (s.charAt(x) == 'a')
	    		counterStub++;
	    }
	    
	    aSInStub = counterStub;
	    
	    
	    
	   TotalAs = (long) aSPerS*nbrFullStrings + aSInStub;
	   
	   return TotalAs; 
	    
	    
	        
	    
	}
	
	}
	
	
	
	

	public static void main(String[] args) {
		InfiniteString inf = new InfiniteString();
		System.out.println(inf.repeatedString("a", 1000000000000L));

	}

}
