package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	// instance variables
	private int itemCode;
	private String itemName;
	private String itemDescription;
	private double itemPrice;
	private int itemVat;
	// constructor method
	public Prodotto(String itemName, String itemDescription, double itemPrice,int itemVat) {
		// new instance for random number
		Random random = new Random();
		// max 8-digit random number
		this.itemCode = 1 + random.nextInt(99999999);
		
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemVat = itemVat;
	}
	// Getters and Setters
	public int getItemCode() {
		return itemCode;
	}
	private void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemVat() {
		return itemVat;
	}
	public void setItemVat(int itemVat) {
		this.itemVat = itemVat;
	}
	// getGrossPrice method
	public double getGrossPrice() {
		return itemPrice + itemPrice * itemVat / 100;
	}
	// getFullName method
	public String getFullName() {
		return itemCode + "-" + itemName;
	}
	// createPaddedCode
	public static String createPaddedCode(int code) {
		return String.format("%08d", code);
	}
}
