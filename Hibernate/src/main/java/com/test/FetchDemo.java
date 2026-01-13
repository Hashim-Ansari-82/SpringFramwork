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
		
		Student1st s=session.get(Student1st.class,1244);
		System.out.println("Student Name : "+s.getStudentName()+"\n"+"Student Age : "+s.getStudentAge());
	
		Certificate1st ct=session.get(Certificate1st.class,2);
		System.out.println("Student Name : "+ct.getStudentName()+"\n"+"Certificate Name : "+ct.getCertiName());
	
		session.close();
		factory.close();
		
	}
}
