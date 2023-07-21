// Program to demonstrate on arithmetic operator

package org.tns.operators;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of num1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the value of num2 : ");
		int num2 = s.nextInt();
		
		// + Operator
		 System.out.println(num1 + num2);
		 
		 // - Operator
		 System.out.println(num1 - num2);
		 
		 // * Operator
		 System.out.println(num1 * num2);
		 
		 //  / Operator
		 System.out.println(num1 + num2);
		 
		 // % Operator
		 System.out.println(num1 % num2);
		 s.close();
		 
		 
		

	}

}
