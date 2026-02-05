package com.springjdbc.mainclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.JavaConfig;
import com.springjdbc.dao.EmployeeDao;

public class EmployeeDelete {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<------------ Enter Id ------------------>");
		int id=Integer.parseInt(br.readLine());
		System.out.println("<------- Start Deleted ---------->");
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		EmployeeDao dao = con.getBean("emp",EmployeeDao.class);
		int delete = dao.delete(id);
		 if(delete>0) {
			  System.out.println("Deleted Successfully ☑️✅✔️✅☑️ ");
			  }
			  else {
				  System.out.println("\nId  Not Present In Table ❎✖️✳️✖️❎");
			  }
	}
}
