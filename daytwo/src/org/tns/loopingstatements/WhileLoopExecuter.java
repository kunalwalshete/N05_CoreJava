// Program to demonstrate while loop
// this loop executed only when the condition is true, if condition is false this loop stop executing
package org.tns.loopingstatements;

import java.util.Scanner;

public class WhileLoopExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(n >= i) {
			System.out.print(n + " ");
			n--;
		}

	}

}
