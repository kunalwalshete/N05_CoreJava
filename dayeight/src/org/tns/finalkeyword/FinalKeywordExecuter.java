package org.tns.finalkeyword;

public class FinalKeywordExecuter {

	public static void main(String[] args) {
		
		// Final Keyword with variable
		FinalVariable f = new FinalVariable();
		// we can't change the value of final variable so here we get the error
		// f.SALARY = 68709.09f;
		f.print();
		
		
		// Final keyword with Method
		Circle c = new Circle();
		c.PrintShapeType();  // accessing final method from shape class i.e parent class
		
		// There is no variable AREA inside driver class so we have to access it from circle so we use c.AREA 
		c.display(c.AREA);          // accessing the method from circle class
 
	}

}
