// Program to demonstrate on ternary operator
// insted of using if else statement we use ternary operator
// Syntax : (Expression) ? ( output when result is true for expression : output when result is false for expression )

package org.tns.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of Num : ");
		int num = s.nextInt();
		String res = (num%2 == 0) ? "Even":"Odd";           // choose datatype according to output values
		int res2 = (num%2 == 0) ? 2:1;

		System.out.println("Result is : " + res);
		System.out.println("Result is : " + res2);

		s.close();

	}

}
