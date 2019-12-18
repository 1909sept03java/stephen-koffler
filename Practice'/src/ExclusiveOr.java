// in exclusive or ^, one condition has to be true and the other has to be false for x to be true,
// otherwise, x is false.
public class ExclusiveOr {
	
	public static void main(String[] main) {
		boolean x = true, z = true;
		int y = 20;
		x = (y!=10) ^ (z =  false); // by assigning false to z, we're MAKING the condition false.
		//since only one conidtion is true, x is true.
		System.out.println(x+" " + y +" " +z);
		
		x = true;
		z = true;
		y = 20;
		x = (y!=10) ^ (z ==  false);
		System.out.println(x+" " + y +" " +z);
		
		x = true;
		z = true;
		y = 20;
		x = (y!=10) ^ (z ==  true);
		System.out.println(x+" " + y +" " +z);
		
		x = true;
		z = true;
		y = 20;
		x = (y!=10) ^ (z = true);// by assining true to z, we're MAKING the condition true
		// since both conditions are true, x is false
		System.out.println(x+" " + y +" " +z);
		
		
		
	}

}
