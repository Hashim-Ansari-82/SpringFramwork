package com.springjdbc.mainclasses;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.JavaConfig;
import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entites.Employee;

public class EmployeeFetch {

	public static void main(String[] args) {
		 System.out.println("<----------- Employee Data ------------>");
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);	
		 EmployeeDao dao = context.getBean("emp",EmployeeDao.class);
		  List<Employee> fetch = dao.fetch();
		  fetch.forEach(list ->{
			  System.out.println(list);
		  });
		  System.out.println("\n<----------- Data Fetch Succesfully ------------->");
	  }
}
