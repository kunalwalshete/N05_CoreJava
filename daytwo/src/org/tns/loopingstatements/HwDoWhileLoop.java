// Question : to print how many digit in the given number using do while
package org.tns.loopingstatements;

import java.util.Scanner;

public class HwDoWhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = s.nextInt();
		int count = 0;
		
		do {
			num = num/10;         // this line removes the last digit from the number and increments the value of count
			count++;
			
		}
		while(num!=0);
		
		System.out.println("The number of digits in the number are : " + count);
	}

}
