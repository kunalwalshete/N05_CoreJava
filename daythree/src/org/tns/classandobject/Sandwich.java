/*Program to demonstrate on class and objects*/
package org.tns.classandobject;

// Class declaration

public class Sandwich {
	
	// Default data member's (Can access inside package)
	String breadtype;
	int noOfSlice;
	
	
	// Method is a block of code that, when called, performs specific actions mentioned in it.
	// Method declaration
	public void display() {
		System.out.println("BreadType : " + breadtype + "   No. Of slice : " + noOfSlice);
	}
	

}
