package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainClass {
   
				public static void main(String[] args) {
				ApplicationContext	context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype.config.xml");
				Student bean = context.getBean("student",Student.class);
				System.out.println(bean);
				System.out.println(bean.getAge());
				}
}
 