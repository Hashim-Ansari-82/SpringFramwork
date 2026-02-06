package com.springjdbc.mainclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.JavaConfig;
import com.springjdbc.dao.FriendsDao;
import com.springjdbc.entites.Friends;

public class FriendsInsert {

	public static void main(String[] args) throws Exception {
		 
			ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
			FriendsDao dao = context.getBean("friends",FriendsDao.class);
				 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				 System.out.println("Enter Friends Name");
				 String name = br.readLine();
				 System.out.println("Enter Friends Age");
				 int age = Integer.parseInt(br.readLine());
				 System.out.println("Enter Friends Address");
				String address = br.readLine();
				System.out.println("Enter Friends State");
				String state = br.readLine();
				Friends friends=new Friends();
				friends.setName(name);
				friends.setAge(age);
				friends.setAddress(address);
				friends.setState(state);
				int insert = dao.insert(friends);
				if(insert>0) {
					System.out.println("Inserted Succesfully");
				}
				else {
					System.out.println("Inserted Failed");
				}
		}
}
