package org.tns.classandobject;

public class SandwitchExecuter {

	public static void main(String[] args) {
		
		// creating object of sandwich class
		Sandwich s = new Sandwich();
		
		// accessing the default variables of Sandwich class using object s 
		s.breadtype = "Brown";
		s.noOfSlice = 4;
		
		// accessing the default method of Sandwich class using the object s
		s.display();

	}

}
