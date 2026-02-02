package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Samosa {

	@Value("Banwari Samosa Wala")
	private String shopName;
	@Value("Gangoli chowraha Sant Kabir Nagar")
	private String shopAddress;
	@Value("Fortune oil")
	private String  useOil;
	@Value("Bahut Badiya samosa hai Banwari ka")
	private String samosaTest;
	@Value(" Rs 10")
	private String samosaPrice;
	
	public void detail() {
		System.out.println("Shop Name = "+shopName);
		System.out.println("Shop Address = "+shopAddress);
		System.out.println("Use Oil = "+useOil);
		System.out.println("Samosa Test = "+samosaTest);
		System.out.println("Samosa Price = "+samosaPrice);
	}
}
