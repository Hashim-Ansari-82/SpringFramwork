package com.springcore.refrence;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainClass {
 
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/refrence/refrence.config.xml");
		Forest f=(Forest)context1.getBean("forest");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/refrence/refrence.config.xml");
		Lion l=(Lion)context2.getBean("lion1");
		
		System.out.println(f.getName());
		System.out.println(f.getPond());
		System.out.println(f.getLion());
		System.out.println(f.getLion().getName());
		System.out.println(f.getLion().getPropertie()); 
		System.out.println(f);
		
		System.out.println(l.getName());
		System.out.println(l.getPropertie());
		System.out.println(l);
	}
}
