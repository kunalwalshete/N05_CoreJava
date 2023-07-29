// Program to demonstrate on access specifier
package org.tns.accessspecifier;

public class Bank {
	
	public String bankName;
	private int pinNo;
    long accountNo;
	
    // Public Method
    public void displayPublic() {
    	System.out.println("Bank name is : "+ bankName);
    }
    
    // Private Method
    private void displayPrivate() {
    	System.out.println("The Pin No. is : "+ pinNo);
    }
    
    // Default method
    void displayDefault() {
    	System.out.println("The account number is : "+ accountNo);
    }
	

}
