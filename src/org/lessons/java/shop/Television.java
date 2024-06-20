package org.lessons.java.shop;

public class Television extends Prodotto{
	// instance variables
	int tvDimension;
	boolean isSmart;
	
	// constructor method
	public Television(String itemName, String itemDescription, double itemPrice, int itemVat, int tvDimension, boolean isSmart) {
		super(itemName, itemDescription, itemPrice, itemVat);
		this.tvDimension = tvDimension;
		this.isSmart = isSmart;
	}
	
	// Getters and Setters
	public int getTvDimension() {
		return tvDimension;
	}

	public void setTvDimension(int tvDimension) {
		this.tvDimension = tvDimension;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
}
