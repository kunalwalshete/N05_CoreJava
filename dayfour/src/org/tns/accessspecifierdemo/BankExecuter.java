package org.tns.accessspecifierdemo;

import org.tns.accessspecifier.Bank;            // we cannot create the object of bank class without importing this

public class BankExecuter {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		// Public members
		b.bankName = "SBI";            // public so we can access it anywhere in project
		b.displayPublic();
		
		// Private members
		// b.pinNo;             // Private data member so we can't access it outside the bank class
		// b.displayPrivate();  // Private method so we can't access it outside the bank class
		                        // we can access private members inside same class only
		
		// Default members
		// b.accountNo = 1234567891011L;   // Default member's can't be access outside the package
		// b.defaultMethod();              // Default member's are access inside same package only
		
		
		// Protected member
		                       // protected member is only access inside that class and the child class of that class
	}

}
