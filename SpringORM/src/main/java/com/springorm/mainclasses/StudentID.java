package com.springorm.mainclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

public class StudentID {
	
	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	
			   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter ID");
		   int id = Integer.parseInt(br.readLine());
		   Student student=new Student();
		   student.setRollno(id);
		   System.out.println("Start Fetching Process ........ !");
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/sporm.config.xml");
		   StudentDao dao = context.getBean("studentDao",StudentDao.class);
		   Student fetch = dao.fetch(id);
		  System.out.println(fetch);
	       String result =(fetch!=null) ? "Fetching successfully" : "Fetching Failed";
	       System.out.println(result);
	    }
	
}
