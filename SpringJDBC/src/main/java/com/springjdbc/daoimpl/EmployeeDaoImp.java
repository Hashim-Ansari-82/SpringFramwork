package com.springjdbc.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entites.Employee;
import com.springjdbc.entites.Students;
																	/* Insert Operation*/
public class EmployeeDaoImp implements EmployeeDao 
{
	     private JdbcTemplate jdbcTemplate;
		@Override        
		public int insert(Employee emp) {
		 String query="insert into employee"
		 		+ "(empId,empName,hireDate,salary,empAge,"+
				 "City,Gender,Contact,empAddress,empEmail,empState) "
		 		+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		 int insert = jdbcTemplate.update(query,emp.getEmpid(),emp.getEmpName(),emp.getHireDate(),
				emp.getSalary(),emp.getEmpAge(),emp.getCity(),emp.getGender(),emp.getContact(),
				emp.getEmpAddress(),emp.getEmpEmail(),emp.getEmpState());
			return insert;
		}
		@Override
		public List<Employee> fetch() {
			String query="Select * from Employee";
			List<Employee> list = jdbcTemplate.query(query,new RowMapperImp1());
			return list;
		}
		public JdbcTemplate getJdbcTemplate() 
		{
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
		{
			this.jdbcTemplate = jdbcTemplate;
		}
  
}
