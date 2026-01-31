package com.springcore.autowirexml;

public class Employee {

	private Company company;

	public Company getCompany() {
		return company;
	}
 
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + "]";
	}
	public Employee(Company company) {
		super();
		this.company = company;
	}

	public Employee() {
		super();
	} 
}
