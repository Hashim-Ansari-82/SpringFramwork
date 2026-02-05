package com.springjdbc.mainclasses;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.JavaConfig;
import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entites.Employee;

public class EmployeeFetch {

	public static void main(String[] args) {
	
		System.out.println("<---------- Show Data From Employee ----------->");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		EmployeeDao dao = context.getBean("emp",EmployeeDao.class);
     List<Employee> emp = dao.fetch();
     emp.forEach( list->{
    	 System.out.println(list);
     });
     System.out.println("<------------- Fetch Succesfully --------------->");
	}
}
