import java.util.Scanner;

public class StringExc {;
public static void main(String[] args) {
	
	 String s = "str";
	 Scanner scan = new Scanner(System.in);
	
	 System.out.println("enter string:");
	 String t = scan.nextLine();
	
		
		s = s.concat(t);
		
		System.out.println(s);
	}
			

}
