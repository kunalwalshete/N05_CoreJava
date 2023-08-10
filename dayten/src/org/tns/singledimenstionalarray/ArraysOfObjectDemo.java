package org.tns.singledimenstionalarray;

//Program to demonstrate on arrays of object

public class ArraysOfObjectDemo {

	public static void main(String[] args) {
		
		// This is array of type employee
		Employee arr[] = new Employee[2];
		
		arr[0] = new Employee(5,"Kunal",900000.8);
		arr[1] = new Employee(6,"Ashutosh",560000.8);
		
		// This is using toString Method
		System.out.println(" Printing the values of elements of array using tostirng mehtod : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// This is using get method
		System.out.println();
		System.out.println(" Printing the values of elements of array using getter mehtod : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println("ID = "+ arr[i].getID() +", Name = "+ arr[i].getName() +", Salary = "+ arr[i].getSalary());
		}
		
		

	}

}
