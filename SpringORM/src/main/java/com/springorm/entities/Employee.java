package com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int empId;
	@Column(name="Employee_Name")
	private String empName;
	@Column(name="Employee_Age")
	private int empAge;
	@Column(name="Employee_Address")
	private String Address;
	@Column(name="Employee_Degree")
	private String Degree;
	@Column(name="Employee_Salary")
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, int empAge, String address, String degree, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		Address = address;
		Degree = degree;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Company [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", Address=" + Address
				+ ", Degree=" + Degree + ", salary=" + salary + "]";
	}
}
