package com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Company")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
}
