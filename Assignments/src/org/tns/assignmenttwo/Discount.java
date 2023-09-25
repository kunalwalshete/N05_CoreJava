package org.tns.assignmenttwo;

public class Discount {

	double discount;
	public double calculateDiscount(Bero bObj) {
		if(bObj instanceof SteelBero) {
			discount = bObj.price*0.10;
		}
		if(bObj instanceof WoodenBero) {
			discount = bObj.price*0.15;
		}
		return discount;
		
	}
}
