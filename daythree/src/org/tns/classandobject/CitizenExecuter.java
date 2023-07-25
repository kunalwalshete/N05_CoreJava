// This is a driver a class to demonstrate default and parameterized constructor
package org.tns.classandobject;

public class CitizenExecuter {

	public static void main(String[] args) {
		// object creation
		Citizen c = new Citizen();   // default constructor is called automatically here
		

		Citizen c1 = new Citizen("Adult",537845061496L,"Male","Nashik"); 
		
		System.out.println(c1);
		
		// To string method is used when the no user defined method exits 
		
			
	}

	
}

	
	


