
public class Unchecked {// approach 2: put a check in your method for the condition
						// that should be avoided adn what you want the program to do
						// if that condition happens.
	
	public static void main(String[] args) {
	int a = 4;
	int b = 0;
	//int c = 0;
	
	if(b == 0)
		throw new ArithmeticException("you can't divide by zero");  
	else  
	   System.out.println(a/b); 
	
	// approach 1: put the risky code in a try/catch block
	//the catch block should show the type of exception 
	//it should be and then what you'd like the program to do.
	
	
//	try {
//		c = a/b;
//	}
//	catch (ArithmeticException e) {
//        System.out.println("dividing by 0");
//    }
//	
//		System.out.println(c);
//		
//		String[] names = new String[]{"Steve","Andy","Ken"};
//		try {
//		System.out.println(names[3]);
//		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.print("your array isn't that long");
//		}

	}}
