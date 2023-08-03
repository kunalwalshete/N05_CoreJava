package org.tns.finalkeyword;

public class Circle extends Shape {

	
    final float AREA = 34.6f;
	
	//  we can't override any final method so we get error here
    // error = Cannot override the final method from Shape
//	void PrintShapeType() {
//		System.out.println(AREA + "sq.cm");
//	}
    
     void display(float AREA) {
    	System.out.println(AREA +"sq.cm");
    }
}
