// This is our grandparent class
package org.tns.multilevelinheritance;

public class Manager {
	private String deptName;
	private String name;
	private int empid;
	
	// Default Constructor
	public Manager() {
		super();
		System.out.println("Default constructor for manager (Grand Parent)");
	}

	// Parameterized Constructor
	public Manager(String deptName, String name, int empid) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empid = empid;
		System.out.println("Parameterized Constructor of manager (Grand Parent)");
	}

	// tostring method
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empid=" + empid + "]";
	}
	
	
	// Getter's and Setter's Method
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	

	
	
	
	
	
	
	
	
}
