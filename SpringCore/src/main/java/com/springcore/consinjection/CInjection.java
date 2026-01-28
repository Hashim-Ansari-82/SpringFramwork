package com.springcore.consinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class CInjection {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/consinjection/ci.config.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
	}
}
x