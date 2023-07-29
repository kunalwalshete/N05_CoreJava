// Program to demonstrate on Default and Parameterized constructor
package org.tns.classandobject;

public class Citizen {
	
	// Default data members
	String citizenType;
	long adhaarCardNo;             // no int because adhaar number is 12 digit int have 10 digit limit
	String gender;
	String city;
	
	// Default constructor ( same name as class || no parameters || no need to use of default)
	// shortcut to create default constructor right click >> source >> superclass constructor
	public Citizen() {
		System.out.println("Demonstration on default constructor");
	}

	//  Parameterized constructor
	// constructor having parameters
	// shortcut: right click >> source >> constructor with fields
	// this keyword is used when both the variable name and parameter name are same
	public Citizen(String citizenType, long adhaarCardNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		// this.datamember = parameter   
		this.adhaarCardNo = adhaarCardNo;
		this.gender = gender;
		this.city = city;
	}

	// The toString method is used to return a string representation of an object.
	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", adhaarCardNo=" + adhaarCardNo + ", gender=" + gender
				+ ", city=" + city + "]";
	}
	
		
	
}
