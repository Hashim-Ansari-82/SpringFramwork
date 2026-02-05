 package com.springjdbc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entites.Employee;
											/* Insert Operation*/
@Component("emp")
public class EmployeeDaoImp implements EmployeeDao 
{
        @Autowired	
	     private JdbcTemplate jdbcTemplate;
		@Override        
		public int insert(Employee emp) {
		 String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
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
		public int delete(int empId) {
			String query="delete from employee where empId=?";
			int update = jdbcTemplate.update(query,empId);
			return update;
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
