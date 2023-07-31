// this keyword as an argument to method call
package org.tns.thiskeyword;

public class ThisKeywordDemoThree {
	
	// passing object as a parameter
	void print(ThisKeywordDemoThree t) {
		System.out.println("Hey there, I am using this keyword");
	}
	
	void dipslay(){
		// when we want to call the parameterized method inside the non-parameterized method then
		// we get an error to overcome that we have to use this keyword as a argument in method call

		print(this);
	}

	public static void main(String[] args) {
		 
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();
		t.dipslay();

	}

}
