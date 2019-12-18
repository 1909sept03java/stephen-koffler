//Comparable example. You implement Comparable and overide compareTo method

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Worker implements Comparable<Worker> {
	String lname;
	int salary;
	
	public Worker(String lname, int salary) {
		super();
		this.lname = lname;
		this.salary = salary;
	}

	
	
	
	public static void main(String[] args) {
		
		ArrayList<Worker> wl=new ArrayList<Worker>();  
		wl.add(new Worker("Smith",23000));  
		wl.add(new Worker("Jones",17000));
		wl.add(new Worker("King",27000));
		
		Collections.sort(wl);
		
		for (Worker worker:wl)
			System.out.println(worker.lname + " " + worker.salary);
	
		
	}

	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public int compareTo(Worker wk){ 
		return this.salary - wk.salary;

		}  
		 
		
	}


