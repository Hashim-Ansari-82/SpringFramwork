package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
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

//	public void detail() {
//		System.out.println("Samosa [shopName=" + shopName + ", shopAddress=" + shopAddress + ", useOil=" + useOil + ", samosaTest="
//				+ samosaTest + ", samosaPrice=" + samosaPrice + "]");
//	}
	
	
}
