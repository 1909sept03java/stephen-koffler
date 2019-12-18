import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LetsIterate {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(4);
		al.add(25);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
	
		
		

	}

}
