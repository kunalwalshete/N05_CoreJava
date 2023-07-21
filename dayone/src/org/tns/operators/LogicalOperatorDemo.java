// Program to demonstrate logical operators
package org.tns.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// and = && operator : if both the conditions are true the the result is true
		System.out.println((5<3) && (5>=3));
		
		// or = || operator : if any one of the conditions is true then the result is true
		System.out.println((5<3) || (5==5));
		
		// not = ! operator : if the value is true the result is false and if the values is false the result is true
		System.out.println(!(5==5));


	}

}
