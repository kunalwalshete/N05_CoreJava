package org.tns.assignmenttwo;

public class WoodenBero extends Bero {

	private String woodType;
	
	// constructor
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}

	
	// implementation of abstract method
	@Override
	public void calculatePrice() {
		if(woodType.equals("Ply Wood")) {
			super.price=15000;
		}
		if(woodType.equals("Teak Wood")) {
			super.price=12000;
		}
		if(woodType.equals("Engineered Wood")) {
			super.price=10000;
		}
	}

	// getter setter method
	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	

	

}
