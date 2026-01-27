package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Program Started" );
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
       Student s = (Student)context.getBean("student1");
       System.out.println(s);
    }
}
