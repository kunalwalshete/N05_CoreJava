package org.tns.multidimentionalarray;

import java.util.Scanner;

public class TwoDimenstionalArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns =  n x m");
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr = new int[n][m];
		
		System.out.println("Enter the matrix of size : "+n+"x"+m);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		
		// Printing an array
		System.out.println();
		System.out.println("The 2D array is : ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
