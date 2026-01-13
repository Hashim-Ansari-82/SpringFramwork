package com.embadable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration(); 
		cfg.configure("com/embadable/hiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student2nd st=session.get(Student2nd.class,1245);
		System.out.println("Student Name : "+st.getStudentName()+"\n"+"Student Age : "+st.getStudentAge());
	
		Company co=session.get(Company.class,2342);
		System.out.println("Company Name : "+co.getCompName()+"\n"+"Company Emp : "+co.getEmp());
		
		session.close();
		factory.close();
		
	}
}
