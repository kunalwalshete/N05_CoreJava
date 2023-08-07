package org.tns.interfacedemo;

public interface DebitCard {
	/* By default all the variables inside and interface are public static final and if it final then we must
	 * have to initialize value of that variable*/
	
	long cardno = 8645856563556324L;
	// We can't use concrete method inside an interface by default, method inside an interface is an abstract
	void displayCardDetails();
	// Default method and static method is the new features of core Java-8 inside an interface
	default void display() {
		System.out.println("Default Method");
	}
	// This is static method
	static void print() {
		System.out.println("Static method");
	}

}
