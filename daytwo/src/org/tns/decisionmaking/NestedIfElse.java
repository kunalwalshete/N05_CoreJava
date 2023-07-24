// Program to demonstrate nested if else statement
// here we skip the use of logical operator and used the nested if..else
package org.tns.decisionmaking;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if(age >= 12) {
			
			if(weight >= 40) {
				System.out.println("You Can Jump");
				
				if(weight > 110) {
					System.out.println(" But Extra ropes will be added");
				}
			}
	
			else {
				System.out.println("You can't Jump");
			}
		}
		else {
			System.out.println("You can't Jump");
		}

	}

}
