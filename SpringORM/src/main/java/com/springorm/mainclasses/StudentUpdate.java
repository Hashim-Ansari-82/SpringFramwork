package com.springorm.mainclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

public class StudentUpdate {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Rollno ");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("Enter New Name");
		String name = br.readLine();
		System.out.println("Enter new Address");
		String address = br.readLine();
		System.out.println("Enter new Gender");
		char gender = (char)br.read();
		System.out.println("Start Updating Process .......... ! ");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springorm/sporm.config.xml");
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		Student student=new Student();
		student.setRollno(rollno);
		student.setName(name);
		student.setAddress(address);
		student.setGender(gender);
		if(student !=null) {
		dao.update(student);
		System.out.println("Updated Successfully ...... !");
		}
	}
}
