package com.springcore.consinjection;

public class Certificate {
   
	String name;

	@Override
	public String toString() {
		return this.name;
	}  

	public Certificate(String name) {
		super();
		this.name = name;
	}
}
