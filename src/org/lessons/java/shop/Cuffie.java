package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	// instance variables
	String coluor;
	boolean isWireless;
	
	// constructor method
	public Cuffie(String itemName, String itemDescription, double itemPrice, int itemVat, String colour, boolean isWireless) {
		super(itemName, itemDescription, itemPrice, itemVat);
		this.coluor = colour;
		this.isWireless = isWireless;
	}
	
	// Getters and Setters
	public String getColuor() {
		return coluor;
	}

	public void setColuor(String coluor) {
		this.coluor = coluor;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	
}
