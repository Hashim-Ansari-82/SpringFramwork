package com.springcore.lifecycle;

public class Mango {

	private double price;
	private String test;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Set Price");
		this.price = price;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public Mango() {
		super();
	}
	@Override
	public String toString() {
		return "Mango [price=" + price + ", test=" + test + "]";
	}
	public void init() {
		System.out.println("Inside init method ");
	}
	public void destroy() {
		System.out.println("Inside destroy method ");
	}
}
