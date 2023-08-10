/*Question: Given an array nums of n integers where n > 1, return an array output such that output[i] 
 * is equal to the product of all the elements of nums except nums[i].

Input:  [1,2,3,4]
Output: [24,12,8,6]*/
package org.tns.challenges;

import java.util.Scanner;

public class ArrayProblemMultiplication {

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
            
         
        int product = 1;
        int[] new_arr = new int[arr_size];
        for(int i=0; i<arr_size; i++) {
        	product = product * arr[i];
        }
        
        //System.out.println(sum);
        for(int i=0; i<arr_size;i++) {
        	new_arr[i]= product/arr[i];
        }
        
        // Printing new array
        System.out.println("The elements of new array: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(new_arr[i] + " ");
        }		

	}

}
