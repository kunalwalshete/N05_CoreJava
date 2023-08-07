// Program to demonstrate on an interface
package org.tns.interfacedemo;

public class InterfaceExecuter {

	public static void main(String[] args) {
		// we cannot create object for interface
		// DebitCard d = new DebitCard();    // Error = Cannot instantiate the interface

		SBIDebitCard s = new SBIDebitCard();
		
		DebitCard.print();           // because print is a static method  so interfacename.methodname();
		
		s.display();   // we can call default method of interface using the object of implementable class (SBIDebitCard)

		
		s.displayCardDetails();     // abstract method which is implemented in SBIDebitCard class
		
		
		
		
		// Object for functional interface
		CheesePopcorn cp = new CheesePopcorn();
		cp.displayRecipe();
	}

}
