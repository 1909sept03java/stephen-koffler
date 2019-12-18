
public class CastingCall {
	
	
	
	public static void main(String[] args) {
		 
		      double d = 200.0445554545454545454545454545454545454545;
		      float f = (float) d;
		      long l = (long) d;  //explicit type casting required
		      int i = (int)l;	//explicit type casting required
		      byte b = (byte) i;
		      
		      float fi = 10;
		      double di = 9;
		      

		      System.out.println("Double value "+d);
		      System.out.println("Float value "+f);
		      System.out.println("Long value "+l);
		      System.out.println("Int value "+i);
		      System.out.println("Byte value "+b);
		    }
	

}
