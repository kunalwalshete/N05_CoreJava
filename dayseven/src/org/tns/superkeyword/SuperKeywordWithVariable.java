// Super keyword with variable is used to call parent class variable if and only if parent and child
// class variable name are same
package org.tns.superkeyword;


class State{
	
	String stateName="Punjab";
	
}


class Capital extends State
{
	String stateName="Hariyana";
	String capital="Chandigarh";
	
	public void display(){
		System.out.println(super.stateName);       // this method will print the value of stateName from parent class
		                                            // i.e Punjab
		System.out.println(stateName);             // this will print the stateName of child class i.e Capital class
		                            		       // Hariyana
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {

		Capital c = new Capital();
		System.out.println(c.stateName);   // this will print the value of stateName inside child class i.e Capital
		// for parent class stateName i.e state class it also print the child class stateName as display method is defined
		c.display();
		

	}

}
