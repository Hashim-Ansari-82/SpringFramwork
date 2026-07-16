package com.springcore.consinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("consinjection.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		
		Addition a=(Addition) context.getBean("add");
		a.doAdd();
	}
}
