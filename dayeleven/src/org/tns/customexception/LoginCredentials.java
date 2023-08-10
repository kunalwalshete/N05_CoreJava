package org.tns.customexception;

// Program to demonstrate on user defined (Custom) exception
public class LoginCredentials extends Exception{

	// private data member
	// If the data member is default or public no need of getter and setter
	private String str;

	// Parameterized method
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	
	// Getter Setter Methods
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}



	// toString Method
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
	
}
