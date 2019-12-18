import java.util.HashMap;
import java.util.Iterator;

public class HashMapTry {

	public static void main(String[] args) {
		HashMap<Character, Integer> hm 
        = new HashMap<>();
		
		String str = "Appomatox";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			else
				hm.put(str.charAt(i), 1);
		
		
	}
		
		
		hm.forEach((key, value) -> System.out.println(key + " : " + value));	
	}}


