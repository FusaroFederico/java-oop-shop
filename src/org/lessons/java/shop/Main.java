package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prod1 = new Prodotto("prodotto1", "descr1", 25.99, 22);
		Prodotto prod2 = new Prodotto("prodotto2", "descr2", 19.99, 22);
		// test prod1
		System.out.println(prod1.getItemCode());
		System.out.println(prod1.getItemName());
		System.out.println(prod1.getItemDescription());
		System.out.println(prod1.getItemPrice());
		System.out.println(prod1.getItemVat());
		System.out.println(prod1.getGrossPrice());
		System.out.println(prod1.getFullName());
		// test prod2
		System.out.println(prod2.getItemCode());
		System.out.println(prod2.getItemName());
		System.out.println(prod2.getItemDescription());
		System.out.println(prod2.getItemPrice());
		System.out.println(prod2.getItemVat());
		System.out.println(prod2.getGrossPrice());
		System.out.println(prod2.getFullName());
		// test setters
		prod1.setItemName("scarpe da corsa");
		prod1.setItemDescription("scarpe da corsa blu che ti fanno correre come Bolt");
		prod1.setItemPrice(109.99);
		prod1.setItemVat(15);
		System.out.println(prod1.getItemName());
		System.out.println(prod1.getItemDescription());
		System.out.println(prod1.getItemPrice());
		System.out.println(prod1.getItemVat());
		System.out.println(prod1.getGrossPrice());
		System.out.println(prod1.getFullName());
		// test createPaddedCode
		String paddedCode = Prodotto.createPaddedCode(prod1.getItemCode());
		System.out.println(paddedCode);

	}
	
}
