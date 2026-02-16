 package com.springorm.mainclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.sql.Template;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDao;
import com.springorm.entities.Employee;

public class Application {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static Employee emp=new Employee();
	static int press;        static  EmployeeDao dao;
	
	public static void main(String[] args) throws Exception {
		menu();
	}
	public static void insert()throws Exception {
		System.out.println("                                 Enter Employee ID");
		int id = Integer.parseInt(br.readLine());
		System.out.println("                                 Enter Employee Name");
		String name=br.readLine();
		System.out.println("                                 Enter Employee Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("                                 Enter Employee Address");
		String address=br.readLine();
		System.out.println("                                 Enter Employee Degree");
		String degree=br.readLine();
		System.out.println("                                 Enter Employee Salary");
		double salary = Double.parseDouble(br.readLine());
		System.out.println("   \n                              Inserting Process Start ................ !");
		connection();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpAge(age);
		emp.setAddress(address);
		emp.setDegree(degree);
		emp.setSalary(salary);
		int insert = dao.insert(emp);
		String result=(insert>0) ? "                                  Inserted Successfully" : "                                 Inserted Failed";  
		System.out.println(result);
		menu();
	}
	public static void fetchAll()throws Exception {
		System.out.println("                                 Fetching Process Start ................ !");
		connection();
		List<Employee> fetchAll = dao.fetchAll();
		 System.out.println("\n************************************************************************************************");
		fetchAll.forEach(list ->{
			System.out.println(list);
		});
		String result=(fetchAll != null)?" \n                                Fetching Successfully":"    \n                             Fetching Failed";
		 System.out.println("*************************************************************************************************");
	  System.out.println("                                 "+result);
	  menu();
	}
	public static void fetchSingle()throws Exception {
		System.out.println("                                Enter Employee ID");
		int id=Integer.parseInt(br.readLine());
		System.out.println("                                 Fetching Process Start ................ !");
		connection();
		emp.setEmpId(id);
		Employee fetchOne = dao.fetchOne(id);
		System.out.println("\n***********************************************************************************************");
		System.out.println(fetchOne);
		String result=(fetchOne != null)?" \n                                Fetching Successfully":"    \n                             Fetching Failed";
		  System.out.println("************************************************************************************************");
		  System.out.println("                                 "+result);
		  menu();
	}
	public static void delete() throws Exception {
		System.out.println("                                Enter Employee ID");
		int id = Integer.parseInt(br.readLine());
		System.out.println("                                 Deleting Process Start ................ !");
		connection();
		if(emp!=null) {
		dao.delete(id);
		System.out.println(" \n                                Deleting Successfully ................ !");
		}
		else {
			System.out.println("                                 Deleting Failed ................ !");
		}
		menu();
	}
	public static void update() throws Exception {
		System.out.println("                                Enter Employee ID");
		int id=Integer.parseInt(br.readLine());
		System.out.println("                                 Enter  new Employee Name");
		String name=br.readLine();
		System.out.println("                                 Enter new Employee Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("                                 Enter new Employee Address");
		String address=br.readLine();
		System.out.println("                                 Enter new Employee Degree");
		String degree=br.readLine();
		System.out.println("                                 Enter new Employee Salary");
		double salary = Double.parseDouble(br.readLine());
		connection();
		System.out.println("                                 Updating Process Start ................ !");
	   emp.setEmpId(id);
	   emp.setEmpName(name);
	   emp.setEmpAge(age);
	   emp.setAddress(address);
	   emp.setDegree(degree);
	   emp.setSalary(salary);
	   if(emp !=null) {
		   dao.update(emp);
		   System.out.println("                                 Updating Successfully ................ !");
		}
		else {
			System.out.println("                                 Updating Failed ................ !");
		}
		menu();
		
	}
	public static void connection(){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springorm/sporm.config.xml");
	   dao = context.getBean("employeeDao",EmployeeDao.class);
	}
	public static void menu()throws Exception {
		System.out.println(" \n                                                  Choose an Option \n");
        System.out.println("Press : 1 add for new Employee			   Press : 2 Display for All Employee\n");
        System.out.println("Press : 3 Display for Single Employee		   Press : 4  delete for Employee\n");
        System.out.println("Press : 5 Update for Employee		                  Press : 6 or Above for Exit\"\n");
        press=Integer.parseInt(br.readLine());
    	do {
		     switch(press) {
		     case 1 :   insert();   	   break;   	      case 2 :   fetchAll();     		 break;	    case 3 :    fetchSingle();   break;
		     case 4:   delete();    break;             case 5:    update();   break;  
		       default :  
		    	   System.out.println("                                                  Thanks for visiting ");
		       break;
		     }
		} 
		while(press < 6);
	}
}
