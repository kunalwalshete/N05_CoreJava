// Program to demonstrate on Encapsulation
/* Encapsulation achive the data hiding using the private access specifier or the wrapping of data*/
// This is driver class (Class containing main method)


package org.tns.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		
		// Setting the value's of private members using setter method
		h.setAccountNo(1234567891011L);
		h.setAccountType("Current account");
		h.setCvvNo(233);
		h.setPinNo(1234);
		
		// accessing and printing all the private members using Getter method
		/*System.out.println(h.getAccountNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());*/
		
		
		// Here we prints the value's of object using tostring() method
		System.out.println(h);

	}

}
