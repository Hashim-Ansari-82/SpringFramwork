package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entites.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public List<Employee> fetch();
	public int delete(int empId);
}
