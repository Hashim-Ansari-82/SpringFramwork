package com.springjdbc.mainclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.config.JavaConfig;
import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entites.Employee;
																/* Insert Operation*/
public class EmployeeInsert {
	
		public static void main(String[] args) throws  IOException {
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);	
		 EmployeeDao dao = context.getBean("emp",EmployeeDao.class);
	     
		 System.out.println("Project Started .......!");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("<------------------- Enter Employee Id ------------------->");
		  int id =Integer.parseInt(br.readLine());
		  System.out.println("<------------------- Enter Employee Name -------------->");
		  String name=br.readLine();
		  System.out.println("<------------------- Enter Hire Date --------------------->");
          String hireDate=br.readLine();
          System.out.println("<--------------------- Enter Salary ----------------------->");
          int salary =Integer.parseInt(br.readLine());
          System.out.println("<------------------- Enter Employee Age ----------------->");
          int age=Integer.parseInt(br.readLine());
          System.out.println("<----------------------- Enter City ------------------------>");
          String city=br.readLine();
	  	  System.out.println("<----------------------- Enter Gender --------------------->");
		  String gender=br.readLine();
		  System.out.println("<------------------- Enter Contact No ------------------->");
		  String contact =br.readLine();
		  System.out.println("<--------------- Enter Employee Address --------------->");
		  String empAddress=br.readLine();
		  System.out.println("<-------------- Enter Employee Email ------------------->");
		  String empEmail=br.readLine();
		  System.out.println("<--------------- Enter Employee State ------------------>");
		  String empState=br.readLine();
		  
		  Employee emp=new Employee();
		  emp.setEmpid(id);
		  emp.setEmpName(name);
		  emp.setHireDate(hireDate);
		  emp.setSalary(salary);
		  emp.setEmpAge(age);
		  emp.setCity(city);
		  emp.setGender(gender);
		  emp.setContact(contact);
		  emp.setEmpAddress(empAddress);
		  emp.setEmpEmail(empEmail);
		  emp.setEmpState(empState);
		  int insert = dao.insert(emp);
		  if(insert>0) {
			  System.out.println("Inserted Successfully ☑️✅✔️✅☑️ ");
			  }
			  else {
				  System.out.println("Inserted Failed ❎✖️✳️✖️❎");
			  }
		}

}
