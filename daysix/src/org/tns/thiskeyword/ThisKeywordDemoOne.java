// It can be used to refer instance variable of current class
package org.tns.thiskeyword;

public class ThisKeywordDemoOne {
	// Default variable
	int x,y;
	
	// Set data method
	// We can change the variable name to avoid confusion instead of this keyword
	void setData(int x, int y) {
		this.x=x;                       // this keyword is used to avoid the confusion between  
		this.y=y;                       // default variable and method's parameter.
	}
	// Method
	void display() {
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(2, 3);
		t.display();
	}

}
