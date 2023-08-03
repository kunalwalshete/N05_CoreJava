/*  
 * Question: There are n people standing in a circle waiting to be executed. The counting out begins at some 
 * point in the circle and proceeds around a circle in a fix direction. In each step a certain number of people
 * are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming 
 * smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.
 * 
 *		Given the total number of person n and number k which indicates that k-1 person are skipped and the 
 *		k th person is killed in a circle.  
 *
 *		The task is to choose the person in initial circle that survives.
 *
 * take = 10
 * k = 2 
 *  */


package org.tns.challenges;

import java.util.Scanner;

public class CircleChallange {
	
	static int survive(int n, int k) {
		if(n==1) {
			return 1;
		}
		else {
			return (survive(n-1,k)+k-1)%n+1;               // recursive function : function calling itself
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.println("The person who survive is : " + survive(n,k));
	}

	

}
