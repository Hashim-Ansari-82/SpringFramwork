package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Apple {

	private double price;

	public Apple() {
		super();
	}
	@Override
	public String toString() {
		return "Apple [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@PostConstruct
	public void start() {
		System.out.println("Start Method");
	}
	@PreDestroy
	public void end() {
		System.out.println("End Method");
	}
}
