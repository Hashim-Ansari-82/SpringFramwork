package com.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaClass {
	  public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = context.getBean(Student.class);
		System.out.println(s1);
	
		Samosa samosa = context.getBean(Samosa.class);
		System.out.println(samosa);
		
		RabbitEntity rabbit = context.getBean(RabbitEntity.class);
		System.out.println(rabbit);
		
	  }
}
 