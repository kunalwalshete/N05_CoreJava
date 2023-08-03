package org.tns.finalkeyword;

// Program to demonstrate on final keyword with variable
public class FinalVariable {
	// The black final field NUM may not have been initialized
	//final int NUM;
	
	final float SALARY = 78000.67f;
	
	public void print() {
//		 we can't change the value of final keyword
//		 SALARY = 89000.56f;  
		System.out.println("Salary is : "+SALARY);
	}
}
