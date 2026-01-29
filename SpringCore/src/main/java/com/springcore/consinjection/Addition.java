package com.springcore.consinjection;

public class Addition {

	private int no1;
	private int no2;
	public Addition(double no1, double no2) {
		super();
		System.out.println("double Constructor");
		this.no1 = (int)no1;
		this.no2 = (int)no2;
	}
	public Addition(int no1, int no2) {
		super();
		System.out.println("int Constructor");
		this.no1 = no1;
		this.no2 = no2;
	}
	public Addition(String no1, String no2) {
		super();
		System.out.println("String Constructor");
		this.no1 = Integer.parseInt(no1);
		this.no2 = Integer.parseInt(no2);
	}
	public void doAdd() {
		System.out.println("Value of a = "+this.no1+"\n"+"value of b = "+this.no2);
		System.out.println("Sum : "+(this.no1+this.no2));
	}
	
}
