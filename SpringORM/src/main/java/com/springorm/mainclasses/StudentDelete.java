package com.springorm.mainclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

public class StudentDelete {

	public static void main(String[] args) throws Exception {
		System.out.println("Deleting Process ..........! ");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springorm/sporm.config.xml");
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Rollno");
		int rollno = Integer.parseInt(br.readLine());
		Student student=new Student();
		if(student != null) {
			dao.delete(rollno);
			System.out.println("Deleted Successfully.....!");
		}
	}
}
