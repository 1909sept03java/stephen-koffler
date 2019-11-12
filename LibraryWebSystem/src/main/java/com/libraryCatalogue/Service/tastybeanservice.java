package com.libraryCatalogue.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.libraryCatalogue.Model.Bean.*;

@Service
public class tastybeanservice {
	{
	
		this.tb = new ArrayList<tastybean>();
		this.tb.add(new tastybean(1, "wbean"));
		this.tb.add(new tastybean(2, "goodbean"));
		this.tb.add(new tastybean(3, "hot"));
		this.tb.add(new tastybean(4, "super"));
	}

	private List<tastybean> tb;
	public void addBean(tastybean f) {
		this.tb.add(f);
		//return true;
	}
	public List<tastybean> allBeans() {
		return this.tb;
	}
}
