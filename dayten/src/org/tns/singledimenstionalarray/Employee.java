package org.tns.singledimenstionalarray;

// Program to demonstrate on arrays of object
public class Employee {
	
	// Variable Declaration
	private int ID;
	private String name;
	private double salary;
	
	// Parameterized Constructor 
	public Employee(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}

	// Getter Setter method
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// to string method
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	

	
	

}
