package org.lessons.java.shop;

public class Smartphone extends Prodotto{
	// instance variables
	long phoneIMEICode;
	int phoneStorage;
	
	// constructor method
	public Smartphone(String itemName, String itemDescription, double itemPrice, int itemVat, long phoneIMEICode, int phoneStorage) {
		super(itemName, itemDescription, itemPrice, itemVat);
		this.phoneIMEICode = phoneIMEICode;
		this.phoneStorage = phoneStorage;
	}
	
	// Getters and Setters
	public long getPhoneIMEICode() {
		return phoneIMEICode;
	}
	public void setPhoneIMEICode(long phoneIMEICode) {
		this.phoneIMEICode = phoneIMEICode;
	}
	public int getPhoneStorage() {
		return phoneStorage;
	}
	public void setPhoneStorage(int phoneStorage) {
		this.phoneStorage = phoneStorage;
	}
	
}
