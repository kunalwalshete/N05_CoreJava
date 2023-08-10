/* Static block use to initialize the static variable 
 * we cannot assign a value for any non-static variable inside*/
package org.tns.stataickeyword;

public class StaticBlock {

	// static variable
	static float salary;
	
	// non-static variable
	String companyName;
	
	// Static block
	static {
		//companyName = "Accenture";   // cannot make a static reference to the non-static field companyName
		salary = 57576.90f;
	}
	
	// Static method
	static void Print() {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Print();
		
	}

}
