package com.springjdbc.mainclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entites.Students;

public class StudentCrudOpe {
	
				 static StudentDao studentDao;
				 static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				 static  int id ;     static Students student;  static int update ; 
				 static int choice ;
	
				 static void fetch() throws Exception {
					 System.out.println("<-------------------------- Enter You can Fetch --------------------------->");
			         System.out.println("   1. Base of Id                   			 2.All Entry");
			         choice = Integer.parseInt(br.readLine());
			         switch(choice) {
			         case 1:   		 f1(); 			break;  case 2:  	f2();   break;
			         default :
		        		 System.out.println("<----------------- Invalid Input ------------------>");
		        		 menu();
		        		 break;
			         }
				 } 
			     static void insert() throws IOException {
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
					 System.out.println("Inserted Failed ❎✖️✳️✖️❎");
				 }
	 }
			     static void delete() throws IOException {
					  System.out.println("<------------------- Enter Student Id ------------------->");
					  int id =Integer.parseInt(br.readLine());
			         
			         int insert = studentDao.delete(id);
			         if(insert>0) {
						  System.out.println("Deleted Successfully ☑️✅✔️✅☑️ ");
						  }
						  else {
							  System.out.println("Deleted Failed ❎✖️✳️✖️❎");
						  }
			 }
			     static  public void update() throws Exception {
				    System.out.println("<-------------------------- Enter You can Update --------------------------->");
			         System.out.println("   1. Name                    			 2. City                                     3.Age");
			         System.out.println("  4.Address                     		 5. Name & Address              6.City & Address");
			         System.out.println("  7.Age & Address   		       	 8.Name & Age                       9.Name & City" );
			         System.out.println("10. City & Age                     	11.Name & City & Age	  12.City & Age & Address");
			         System.out.println("13.Age & Address & Name       14.Address & Name & City   15.All Update");
			         choice = Integer.parseInt(br.readLine());
			         if(studentDao !=null) {
	        	
			         switch(choice) {
			        	 case 1:      u1();    menu();  break;       case 2:    u2();         menu();  break;  case 3:      u3();     menu();   break;
			        	 case 4:      u4();    menu(); break;       case 5:    u5();         menu();  break;  case 6:      u6();     menu();  break;
			        	 case 7:      u7();    menu(); break;       case 8:    u8();        menu();  break;  case 9:      u9();     menu(); break;
			        	 case 10:    u10(); menu();   break;      case 11:    u11();    menu();   break;  case 12:    u12();   menu();    break;
			        	 case 13:    u13();  menu();  break;       case 14:    u14();    menu();   break;  case 15:    u15();   menu();    break;
			        	 default :
			        		 System.out.println("<----------------- Invalid Input ------------------>");
			        		 menu();
			        		 break;
			        	 }
	          }
	}
			     static void f1() throws Exception {
				    	System.out.println("<-------------------- Enter Id ---------------------->");
				  		int  id =Integer.parseInt(br.readLine());
					 Students fetch = studentDao.f1(id);
					 System.out.println(fetch);
				   }
				 static void f2() throws Exception {
						  List<Students> fetch = studentDao.f2();
						  fetch.forEach(list ->{
							  System.out.println(list);
						  });
						  System.out.println("\n<----------- Data Fetch Succesfully ------------->");
					  }
			     static void u1() throws Exception {
				   System.out.println("<-------------------- Enter Id ---------------------->");
		  		   id =Integer.parseInt(br.readLine());
		  		  System.out.println("<------------------ Enter Name -------------------->");
		          String name=br.readLine();
		          student=new Students();
		          student.setId(id);
		          student.setStudentName(name);
		          update = studentDao.u1(student);
		          if(update>0) {
					  System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
					  }
					  else {
						  System.out.println("Updated Failed ❎✖️✳️✖️❎");
					  }
	   }   
			     static void u2() throws Exception{
  		 System.out.println("<-------------------- Enter Id ---------------------->");
  		 id =Integer.parseInt(br.readLine());
  		 System.out.println("<------------------ Enter City -------------------->");
  		 String city=br.readLine();
  		 student=new Students();
  		 student.setId(id);
  		 student.setCity(city);
  		 update = studentDao.u1(student);
	  		 if(update>0) {
	  			 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  		 }
	  		 else {
	  			 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  		 }
	   }
	  	    	 static void u3() throws Exception{
	  			 System.out.println("<-------------------- Enter Id ---------------------->");
	  			 id =Integer.parseInt(br.readLine());
	  			 System.out.println("<------------------ Enter Age -------------------->");
	  			 int age=Integer.parseInt(br.readLine());
	  			 student=new Students();
	  			 student.setId(id);
	  			 student.setAge(age);
	  			 update = studentDao.u3(student);
	  			 if(update>0) {
	  				 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  			 }
	  			 else {
	  				 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  			 }
	  		 }
	  			 static void u4() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Address -------------------->");
	  				 String address=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setAddress(address);
	  				 update = studentDao.u4(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	   }
	  			 static void u5() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
	  				 System.out.println("<------------------ Enter Address -------------------->");
	  				 String address=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setStudentName(name);
	  				 student.setAddress(address);
	  				 update = studentDao.u5(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  	 }
	  			 static void u6() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter city -------------------->");
	  				 String city=br.readLine();
	  				 System.out.println("<------------------ Enter Address -------------------->");
	  				 String address=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setCity(city);
	  				 student.setAddress(address);
	  				 update = studentDao.u6(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  		 }
	  			 static void u7() throws Exception{
		  			 System.out.println("<-------------------- Enter Id ---------------------->");
		  			 id =Integer.parseInt(br.readLine());
		  			 System.out.println("<------------------ Enter Age -------------------->");
		  			 int age=Integer.parseInt(br.readLine());
		  			 System.out.println("<------------------ Enter Address -------------------->");
	  				 String address=br.readLine();
		  			 student=new Students();
		  			 student.setId(id);
		  			 student.setAge(age);
		  			 student.setAddress(address);
		  			 update = studentDao.u7(student);
		  			 if(update>0) {
		  				 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
		  			 }
		  			 else {
		  				 System.out.println("Updated Failed ❎✖️✳️✖️❎");
		  			 }
		  		 }
	  			 static void u8() throws Exception{
		  			 System.out.println("<-------------------- Enter Id ---------------------->");
		  			 id =Integer.parseInt(br.readLine());
		  			 System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
		  			 System.out.println("<------------------ Enter Age -------------------->");
		  			 int age=Integer.parseInt(br.readLine());
		  			 student=new Students();
		  			 student.setId(id);
		  			 student.setStudentName(name);
		  			 student.setAge(age);
		  			 update = studentDao.u8(student);
		  			 if(update>0) {
		  				 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
		  			 }
		  			 else {
		  				 System.out.println("Updated Failed ❎✖️✳️✖️❎");
		  			 }
		  		 }
	  			 static void u9() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
	  				 System.out.println("<------------------ Enter City -------------------->");
	  				 String city=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setStudentName(name);
	  				 student.setCity(city);
	  				 update = studentDao.u9(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  	 }
	  			 static void u10() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter City -------------------->");
	  				 String city=br.readLine();
	  	 			 System.out.println("<------------------ Enter Age -------------------->");
		  			 int age=Integer.parseInt(br.readLine());
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setCity(city);
	  				 student.setAge(age);
	  				 update = studentDao.u10(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  			 }
	  			 static void u11() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
	  				 System.out.println("<------------------ Enter City -------------------->");
	  				 String city=br.readLine();
	  				 System.out.println("<------------------ Enter Age -------------------->");
	  				 int age=Integer.parseInt(br.readLine());
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setStudentName(name);
	  				 student.setCity(city);
	  				 student.setAge(age);
	  				 update = studentDao.u11(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  			 }
	  			 static void u12() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				System.out.println("<------------------ Enter City -------------------->");
	  				 String city=br.readLine();
	  				System.out.println("<------------------ Enter Age -------------------->");
	  				 int age=Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Address ----------------->");
	  				 String address=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setCity(city);
	  				 student.setAge(age);
	  				 student.setAddress(address);
	  				 update = studentDao.u12(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  			 }
	  			 static void u13() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Age -------------------->");
	  				 int age=Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Address ----------------->");
	  				 String address=br.readLine();
	  				System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				student.setAge(age);
	  				student.setAddress(address);
	  				 student.setStudentName(name);
	  				 update = studentDao.u13(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  			 }
	  			 static void u14() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				 System.out.println("<------------------ Enter Address ----------------->");
	  				 String address=br.readLine();
	  				 System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
	  				System.out.println("<------------------ Enter City -------------------->");
	  				 String city=br.readLine();
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setAddress(address);
	  				 student.setStudentName(name);
	  				 student.setCity(city);
	  				 update = studentDao.u14(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  			 }
	  			 static void u15() throws Exception{
	  				 System.out.println("<-------------------- Enter Id ---------------------->");
	  				 id =Integer.parseInt(br.readLine());
	  				System.out.println("<------------------ Enter Name -------------------->");
	  				 String name=br.readLine();
	  				 System.out.println("<------------------ Enter City -------------------->");
	  				 String city=br.readLine();
	  				System.out.println("<------------------ Enter Address ----------------->");
	  				 String address=br.readLine();
	  				 System.out.println("<------------------ Enter Age -------------------->");
	  				 int age=Integer.parseInt(br.readLine());
	  				 student=new Students();
	  				 student.setId(id);
	  				 student.setStudentName(name);
	  				 student.setCity(city);
	  				 student.setAddress(address);
	  				 student.setAge(age);
	  				 update = studentDao.u15(student);
	  				 if(update>0) {
	  					 System.out.println("Updated Successfully ☑️✅✔️✅☑️ ");
	  				 }
	  				 else {
	  					 System.out.println("Updated Failed ❎✖️✳️✖️❎");
	  				 }
	  		 }
	  			 public  static void menu() throws Exception {
	  				 System.out.println("\n<------------------ Enter Any Operation You Can Perform -------------------->\n");
	  				 System.out.println("                    1.Insert                               	      			 2.Update\n");
	  				 System.out.println("                    3.Delete                           			  		  4.Fetch\n");
	  				 System.out.println("                                       			     5. Exit ");
	  				choice = Integer.parseInt(br.readLine());
	  				switch(choice) {
	  				
	  				case 1 :  insert();  break;     case 2:   update();  break;   case 3:  delete();   break; case 4:  fetch();  break;
	  				 default :
		        		 System.out.println("<----------------- Program Terminated ------------------>");
		        		 System.exit(choice);
		        	 }
	  	}
	  			 public static void main(String[] args) throws Exception {
	  				ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/spjdbc.config.xml");
	  		         studentDao = context.getBean("studentDao",StudentDao.class);
					menu();
				}
}
