package com.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainClass {
	  public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = context.getBean("temp",Student.class);
		s1.detail();
	
		Samosa samosa = context.getBean("samosa",Samosa.class);
		samosa.detail();
	  }
}
 