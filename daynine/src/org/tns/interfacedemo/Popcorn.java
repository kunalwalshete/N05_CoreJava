// Functional interface
// Functional interface is a interface which contain exactly one abstract method

package org.tns.interfacedemo;

// Below annotation ensures that we have to use exactly one abstract method inside an interface
@FunctionalInterface
public interface Popcorn {

	void displayRecipe();
}
