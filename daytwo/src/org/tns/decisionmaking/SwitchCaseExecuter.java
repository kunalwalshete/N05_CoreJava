// Program to execute switch ....... case
package org.tns.decisionmaking;

import java.util.Scanner;

public class SwitchCaseExecuter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		String song_no = s.next();
		
		switch (song_no) {                                // switch with the expression which is going to give multiple result 
		
			case "1":                                      // based on result of expression the case statement get executed
				System.out.println("Heatwaves");
				break;
				
			case "2" :
				System.out.println("Gasolina");
				break;
				
			case "3" :
				System.out.println("Let me love you");
				break;
				
			default :
				System.out.println("Invalid Input");
			
		}
		

	}

}
