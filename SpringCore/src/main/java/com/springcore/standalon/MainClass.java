package com.springcore.standalon; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
	ApplicationContext context=new	ClassPathXmlApplicationContext("standalon.config.xml");
	
	 Person per = context.getBean("person",Person.class);
	 System.out.println(per);
	 System.out.println(per.getFriends().getClass().getName());
	 System.out.println("<++++++++++++++++++++++++++++++++++++++++++++>");
	 System.out.println(per.getFee());
	 System.out.println(per.getFee().getClass().getName());
	 System.out.println("<++++++++++++++++++++++++++++++++++++++++++++>");
	 System.out.println(per.getProps());
	 System.out.println(per.getProps().getClass().getName());
	 
	}
}
	