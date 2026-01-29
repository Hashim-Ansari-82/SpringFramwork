package com.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println( "Program Started" );
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collection.config.xml");
		
		Employee e1 = (Employee)context.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones());
		System.out.println(e1.getProp());
	}
} 
