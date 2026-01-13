package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration(); 
		cfg.configure("com/test/hiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=session.get(Student.class,6);
		System.out.println("Student Name : "+s.getStudentName()+"\n"+"Student Age : "+s.getStudentAge());
	
		session.close();
		factory.close();
		
	}
}
