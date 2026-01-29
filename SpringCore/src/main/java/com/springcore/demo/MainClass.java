package com.springcore.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main( String[] args )
    {
       System.out.println( "Program Started" );
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/demo/demo.config.xml");
       Student s1 = (Student)context.getBean("student1");
       Student s2 = (Student)context.getBean("student2");
       Student s3 = (Student)context.getBean("student3");
       
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
    }
}
