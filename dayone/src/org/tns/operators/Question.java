package org.tns.operators;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = s.nextInt();
		System.out.println("Enter Your Weight : ");
		int weight = s.nextInt();
		
		if(age >= 18 && weight >=50) {
			System.out.println("You can donate Blood");
		}
		else {
			System.out.println("You can't donate Blood");
		}
		s.close();
		

	}

}
