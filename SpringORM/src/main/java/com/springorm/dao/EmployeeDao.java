package com.springorm.dao;

import java.util.List;

import com.springorm.entities.Employee;

public interface EmployeeDao {
 
	public int insert(Employee emp);
	public Employee fetchOne(int empid);
	public List<Employee> fetchAll();
	public void delete(int empId);
	public void update(Employee empId);
}
