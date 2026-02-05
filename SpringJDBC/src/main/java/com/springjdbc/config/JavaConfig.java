package com.springjdbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.daoimpl.EmployeeDaoImp;
import com.springjdbc.daoimpl.StudentDaoImp;

@Configuration
public class JavaConfig {
 
		@Bean("ds")
		public DataSource getDataSource() {
			DriverManagerDataSource ds=new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
		}
		@Bean("jdbcTemplate")
		public JdbcTemplate getTemplate() {
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());	
			return jdbcTemplate;
		}
		@Bean("student")
		public StudentDao getStudentDao() {
			StudentDaoImp student =new StudentDaoImp();
			student.setTemplate(getTemplate());
			return student;
		}
		@Bean("emp")
		public EmployeeDao getEmployeeDao() {
			EmployeeDaoImp emp =new EmployeeDaoImp();
			emp.setJdbcTemplate(getTemplate());
			return emp;
		}
}
