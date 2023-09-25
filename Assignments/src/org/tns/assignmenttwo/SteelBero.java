package org.tns.assignmenttwo;

public class SteelBero extends Bero {

	private int beroHeight;
	public SteelBero(String beroType, String beroColour,int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight=beroHeight;
	}
	
	// implementation of abstract method
	@Override
	public void calculatePrice() {
		if(beroHeight==3) {
			super.price=5000;
		}
		if(beroHeight==5) {
			super.price=8000;
		}
		if(beroHeight==7) {
			super.price=10000;
		}
		
	}
	
	// getter setter methods
	public int getBeroHeight() {
		return beroHeight;
	}
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	
	
	
	

}
