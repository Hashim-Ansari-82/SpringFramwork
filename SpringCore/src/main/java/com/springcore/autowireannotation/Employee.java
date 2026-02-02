package com.springcore.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("company2")
	private Company company;

	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		System.out.println("Setting by Method");
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [company=" + company + "]";
	}
	public Employee(Company company) {
		super();
		System.out.println("Setting by Constructor");
		this.company = company;
	}

	public Employee() {
		super();
	} 
}
