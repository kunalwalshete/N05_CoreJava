
/* Pratik is so much interesting in gardening and hence he plants more trees in his garden.
 * He plants trees in a rectangular fashion with the order of rows and columns and numbers the
 * trees in a row wise order . He planted the mango tree only in the first row first column and last column.
 * 
 * So, given the tree number and rows and columns your task is to find out whether the given tree is mango 
 * tree or not
 * 
 * n = 5  ( 5 rows and 5 column)
 * t = 11  ( Tree number ) you have to check 11th tree is mango tree or not
 *  */

package org.tns.challenges;

import java.util.Scanner;

public class MangoTreeExecuter {
	
	static void MangoTree(int n, int t) {
		
		if(t%n==0 || t%n==1 || t<=n) {
			System.out.println("The"+ t +" tree is Mango Tree");
		}
		else {
			System.out.println("The "+ t + " tree is not a Mango tree");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of number of row's and column : ");
		int n = s.nextInt();
		System.out.println("Enter the number of tree : ");
		int t = s.nextInt();
		MangoTree(n,t);   // calling a function
		

	}

}
