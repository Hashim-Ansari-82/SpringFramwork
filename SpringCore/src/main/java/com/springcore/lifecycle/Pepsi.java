package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{

	/* Bean life cycle using Interface */
	
	private double price;

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy By Interface");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init by interface");
	}
}
