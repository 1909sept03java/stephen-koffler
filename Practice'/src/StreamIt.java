

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StreamIt {
	
	public static void main(String[] args) {
		List names = Arrays.asList("Reflection","Collection","Stream");
		List result = (List) names.stream().sorted().collect(Collectors.toList());
		
		while (result.iterator().hasNext())
		System.out.println(result.iterator().next());
		
	}

}
