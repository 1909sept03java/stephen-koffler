package com.revature.hw1.prob7;

public class Employee{
	String name;
	int age;
	int dept;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, int dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		
	}
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee("John", 29, 4);
		Employee obj2 = new Employee("Betsy", 24, 5);
		
		compare(Employee obj1, Employee obj2) 
	    { 
	        return obj1.age - obj2.age; 
	    } 
	}

}
 