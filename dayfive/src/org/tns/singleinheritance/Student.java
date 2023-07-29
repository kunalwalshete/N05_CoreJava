package org.tns.singleinheritance;

// Derived class (Child Class)
public class Student extends Citizen   // student class (Child class) inheritate the properties of citizen class (Parent class)
{
	
	// Private data members
	private String collegeName;
	private int rollNo;
	
	// Default constructor
	public Student() {
		super();            // Use of Super keyword is to call the parent class default constructor
		System.out.println("This is Child class Default constructor");
		
	}
	
	// Parameterized constructor
	public Student(String city, int pincode, long adhaarNo, long contactNo, 
			String collegeName, int rollNo) {
		super(city, pincode, adhaarNo, contactNo);        // Super keyword call the parent class constructor
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	
	//Getter's and Setter's Method
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	// it have both student class members and also inherites the tostring method of parent class using super keyword
	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
