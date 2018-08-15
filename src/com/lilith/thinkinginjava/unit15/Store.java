package com.lilith.thinkinginjava.unit15;

import java.util.*;
/**
 * 
 * @author 56580
 *
 */
public class Store extends ArrayList<Aisle>{
	private ArrayList<CheckoutStand> checkouts = 
			new ArrayList<CheckoutStand>();
	private Office office = new Office();
	public Store(int nAisles, int nShelves, int nProducts) {
		for(int i = 0; i < nAisles; i++) {
			add(new Aisle(nShelves, nProducts));
		}
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(Aisle aisle : this) {
			for(Shelf s : aisle) {
				for(Product p : s) {
					sb.append(p);
					sb.append("\n");
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
}

class Product{
	private final int id;
	private double price;
	private String description;
	public Product(int IDnumber, String descr, double price) {
		this.id = IDnumber;
		this.description = descr;
		this.price = price;
	}
	@Override
	public String toString() {
		return id + ": " + description + " , price: $" + price;
	}
	public void priceChange(double change) {
		price += change;
	}
	public static Generator<Product> generator = 
			new Generator<Product>() {
				private Random rand = new Random(47);
				public Product next() {
					return new Product(rand.nextInt(1000), 
							"test", Math.round(rand.nextDouble() * 1000) + 0.99);
				}
			};
}
class Shelf extends ArrayList<Product>{
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}
class Aisle extends ArrayList<Shelf>{
	public Aisle(int nShelves, int nProducts) {
		for(int i = 0; i < nShelves; i++) {
			add(new Shelf(nProducts));
		}
	}
}
class CheckoutStand{}
class Office{}
