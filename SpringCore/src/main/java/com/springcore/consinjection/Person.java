package com.springcore.consinjection;

import java.util.List;

public class Person {

	private int personId;
	private String personName;
	private Certificate certi;
	private List<String> list;
	
	public Person(int personId, String personName, Certificate certi,List<String> list) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certi = certi;
		this.list=list;
	}
	@Override 
	public String toString() {
		return this.personName +" : "+this.personId+" : {"+this.certi+"}"+" : "+this.list; 
	}
} 
