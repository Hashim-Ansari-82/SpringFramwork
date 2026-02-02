package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
     public static void main(String[] args) {
		
     ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/scope/scope.config.xml");
	
		/* Scope with Annotation */
     
     Person r1 = context.getBean("person",Person.class);
     Person r2 = context.getBean("person",Person.class);
     Person r3 = context.getBean("person",Person.class);
     Person r4 = context.getBean("person",Person.class);
     Person r5 = context.getBean("person",Person.class);

     System.out.println(r1.hashCode());
     System.out.println(r2.hashCode());
     System.out.println(r3.hashCode()); 
     System.out.println(r4.hashCode());
     System.out.println(r5);
     
        /* Scope with Xml */
     
     Lion l1 = context.getBean("lion",Lion.class);
     Lion l2 = context.getBean("lion",Lion.class);
     Lion l3 = context.getBean("lion",Lion.class);
     Lion l4 = context.getBean("lion",Lion.class);
     
     System.out.println("<----------->");
     System.out.println(l1.hashCode());
     System.out.println(l2.hashCode());
     System.out.println(l3.hashCode()); 
     System.out.println(l4.hashCode());
     }
}
