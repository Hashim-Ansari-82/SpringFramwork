package com.springcore.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("annotation.config.xml");
	
	 Employee bean = context.getBean("employee",Employee.class);
	 System.out.println(bean);
		
	 Company bean1 = context.getBean("company1",Company.class);
	 System.out.println(bean1);	 
		  
	}
}
