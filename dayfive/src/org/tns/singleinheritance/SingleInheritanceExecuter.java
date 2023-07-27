// Program to demonstrate on single inheritance 
// Driver class
package org.tns.singleinheritance;

public class SingleInheritanceExecuter {

	public static void main(String[] args) {
		
		Student s = new Student("Nashik", 422207, 537845061496L, 7666754694L, "Met Institute on Engineering",31);
		// THis will called the parameterized constructor of child class
		System.out.println(s);
		
		Student s1 = new Student();   // This will called default constructor of child class
		// System.out.println(s1);            
		// we already use sysout statement at the time of constructor declaration so 
		//this sysout will print the value of object i.e. parameterized constructor

	}

}
