package org.tns.finalkeyword;

// we cam't inherit final class 
// we will get error in circle class which extends the shape class

// public final class shape
public class Shape {

	final String SHAPENAME = "Circle";
	
	// final method
	final void PrintShapeType() {
		System.out.println(SHAPENAME);
	}
}
