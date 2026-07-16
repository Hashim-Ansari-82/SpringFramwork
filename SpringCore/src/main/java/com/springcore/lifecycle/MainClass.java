package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.config.xml");
	    Mango m=(Mango) context.getBean("mango");
	    System.out.println(m);
	    context.registerShutdownHook();
	    
	    Object bean = context.getBean("pepsi");
	    System.out.println(bean);
	    
	     Object bean1 = context.getBean("apple"); 
		 System.out.println(bean1);
	} 
}
 