package com.springjdbc.mainclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entites.Students;

public class StudentClass {
	
	    public static void main( String[] args ) throws Exception {
	    	
		   System.out.println( "Program Started .......... !" );
		   ApplicationContext context = new ClassPathXmlApplicationContext(" com/springjdbc/mainclass/student.config.xml");
          StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		   
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("<------------------- Enter Student Id ------------------->");
		  int id =Integer.parseInt(br.readLine());
		  System.out.println("<------------------- Enter Student Name -------------->");
		  String name=br.readLine();
		  System.out.println("<------------------- Enter Student age ----------------->");
         int age=Integer.parseInt(br.readLine());
         System.out.println("<------------------- Enter Student City ----------------->");
         String city=br.readLine();
         System.out.println("<------------------- Enter Student Address ------------>");
         String address=br.readLine();
         
         Students student=new Students();
         student.setId(id);
         student.setStudentName(name);
         student.setAge(age);
         student.setCity(city);
         student.setAddress(address);
         int insert = studentDao.insert(student);
         if(insert>0) {
			  System.out.println("Inserted Successfully ☑️✅✔️✅☑️ ");
			  }
			  else {
				  System.out.println("Inserted Failed ✖️❎✳️❎✖️");
			  }
	    }
}
