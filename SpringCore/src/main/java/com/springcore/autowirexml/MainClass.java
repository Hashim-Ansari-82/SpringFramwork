package com.springcore.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		Employee bean = context.getBean("emp", Employee.class);
		System.out.println(bean);

		Company bean1 = context.getBean("comp", Company.class);
		System.out.println(bean1);
		
		Certificate certificate = context.getBean("cer",Certificate.class);
		System.out.println(certificate);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}
}
