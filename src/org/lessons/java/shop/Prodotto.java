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
		// 8-digit random number
		this.itemCode = 1 + random.nextInt(99999999);
		
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemVat = itemVat;
	}
}
