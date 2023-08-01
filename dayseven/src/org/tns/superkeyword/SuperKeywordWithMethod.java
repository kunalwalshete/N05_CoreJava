/* If parent and child class methods are same and if we want to call parent class method inside child class 
 * then we use super.methodname()*/
package org.tns.superkeyword;

// Parent Class
class Sports{
	
	String sportsName="Cricket";
	
	void display() {
		System.out.println("Sports Name is : "+sportsName);
	}
}

// Child Class
class Cricket extends Sports{
	
	int noOfPlayers = 11 ;
	
	void display() {
		super.display();                 // this will call the display method of parent class (Sprots)
		System.out.println("Sports Name is : "+noOfPlayers);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
		c.display();               // here we get the number of players because it call child class display method
		                              // after using super we get parent class method first and then child class method

	}

}
