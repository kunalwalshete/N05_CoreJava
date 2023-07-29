// Program to demonstrate on Encapsulation
/* Encapsulation achive the data hiding using the private access specifier or the wrapping of data*/
package org.tns.encapsulation;

public class HDFC {
	
	private long accountNo;
	private int cvvNo;
	private String accountType;
	private int pinNo;
	
	// Private member's can be access in another class using getter and setter method only
	// Getter method is used to get (Return only not print's) the value
	// Setter method is used to set a value
	
	// Getters and Setters Methods
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	// tostring() methods to print the values of object
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ "]";
	}
	
	

}
