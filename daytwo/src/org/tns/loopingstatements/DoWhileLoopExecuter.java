// Program to demonstrate Do While Loop
// same as while loop but it guarantee that it executes ones independent on condition it is false or true

// question : to print how many digit in the given number using do while
package org.tns.loopingstatements;

import java.util.Scanner;

public class DoWhileLoopExecuter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		do {
			System.out.println("Value of n is : " + n);
			n++;
		}
		while(n < 14);
	}

}
