package com.springcore.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaClass {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = context.getBean(Student.class);
		System.out.println(s1);
		
		Certificate certificate = context.getBean(Certificate.class);
		System.out.println(certificate);
	}
}
