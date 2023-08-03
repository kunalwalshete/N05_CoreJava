/* Problem statement : You have been given an array of positive integers A1,A2,...,An 
 * with legnth N and you have to print an array of same legnth(N) where the values in the
 *  new array are the sum of every number in the array, except the number at that index.

Input:
The first line of input contains a single integer T denoting the number of test cases.
Each test cases contain two lines.First line contains N, the length of the array and second line
 contains N space separated positive integers.
*/
package org.tns.challenges;

import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int arr_size = sc.nextInt();
		
		// Declaring a array
		int[] arr = new int[arr_size];
		  
        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
                arr[i] = sc.nextInt(); 
        }
        
        // Printing an array
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr_size; i++) {
                System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
            
         
        int sum = 0;
        int[] new_arr = new int[arr_size];
        for(int i=0; i<arr_size; i++) {
        	sum = sum +arr[i];
        }
        
        System.out.println(sum);
        for(int i=0; i<arr_size;i++) {
        	new_arr[i]=sum-arr[i];
        }
        
        // Printing new array
        System.out.println("The elements of new array: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(new_arr[i] + " ");
    }
        
        
        
        
		
		

	}

}
