package com.springorm.mainclasses;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

public class StudentFetch {
	
	    public static void main(String[] args) {
	    	System.out.println("Fetching Process ........ !");
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/sporm.config.xml");
		   StudentDao dao = context.getBean("studentDao",StudentDao.class);
		   List<Student> fetch = dao.fetch();
	       String result =(fetch!=null) ? "Fetching successfully" : "fetching Failed";
	       System.out.println(result);
	    }
	
}
