package com.springcore.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main( String[] args )
    {
       System.out.println( "Program Started" );
       ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
       
       Student s1 = (Student)context.getBean("student");
       System.out.println(s1);
    
       Horse horse = context.getBean("horse",Horse.class);
       System.out.println(horse);
       
       Lion lion = context.getBean("lion",Lion.class);
       System.out.println(lion);
    }
}
