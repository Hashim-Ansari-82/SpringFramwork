package com.springorm.mainclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

public class StudentInsert {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name ");
		String name = br.readLine();
		System.out.println("Enter Address ");
		String address = br.readLine();
		System.out.println("Enter Gender ");
		char gender =(char)br.read();
		System.out.println("Start Insert Process ....!");
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springorm/sporm.config.xml");
		StudentDao bean = context.getBean("studentDao",StudentDao.class);
		Student student=new Student();
       student.setName(name);
       student.setAddress(address);
       student.setGender(gender);
       int insert = bean.insert(student);
       String result =(insert>0) ? "Inserted successfully" : "Inserted Failed";
       System.out.println(result);
     
	}
}
