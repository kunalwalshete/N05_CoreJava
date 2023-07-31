package org.tns.thiskeyword;

public class ThisKeywordDemoFour {

	int x;
	// default constructor
	ThisKeywordDemoFour(){
		this(10);   // calling to parameterized constructor using this keyword with argument 10
		            // then parameterized constructor is executed first and then default constructor is executed
		System.out.println("This is default constructor");
	}
	
	// Parameterized constructor
	ThisKeywordDemoFour(int x){
		this.x = x;
		System.out.println("This is parameterized constructor : " + x);
	}
	
	public static void main(String[] args) {
		ThisKeywordDemoFour t = new ThisKeywordDemoFour();  // call to default constructor

	}

}
