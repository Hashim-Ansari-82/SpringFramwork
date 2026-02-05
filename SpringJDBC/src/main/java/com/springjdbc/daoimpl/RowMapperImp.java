package com.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entites.Employee;
import com.springjdbc.entites.Students;

public class RowMapperImp implements RowMapper<Students>{

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
        Students student = new Students();
        student.setId(rs.getInt(1));
        student.setStudentName(rs.getString(2));
        student.setAge(rs.getInt(3));
        student.setCity(rs.getString(4));
        student.setAddress(rs.getString(5 ));
		return student;
	}

}
class RowMapperImp1 implements RowMapper<Employee>{
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Employee employee = new Employee();
		 employee.setEmpid(rs.getInt(1));
		 employee.setEmpName(rs.getString(2));
		 employee.setHireDate(rs.getString(3));
		 employee.setSalary(rs.getInt(4));
		 employee.setEmpAge(rs.getInt(5));
		 employee.setCity(rs.getString(6));
		 employee.setGender(rs.getString(7));
		 employee.setContact(rs.getString(8));
		 employee.setEmpAddress(rs.getString(9));
		 employee.setEmpEmail(rs.getString(10));
		 employee.setEmpState(rs.getString(11));
		return employee;
	}
	
}
