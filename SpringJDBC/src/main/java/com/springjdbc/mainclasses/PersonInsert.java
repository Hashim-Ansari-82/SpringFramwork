package com.springjdbc.mainclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.PersonDao;
import com.springjdbc.entites.Person;

public class PersonInsert {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		PersonDao personDao = context.getBean("personDao",PersonDao.class);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Person Id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter Person Name");
		String name = br.readLine();
		System.out.println("Enter Person Age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter Person Address");
		String address = br.readLine();
		System.out.println("Enter Person Country");
		String country = br.readLine();
		Person person = new Person();
		person.setPerId(id);
		person.setPerName(name);
		person.setAddress(address);
		person.setAge(age);
		person.setCountry(country);
		int insert = personDao.insert(person);
		if(insert>0) {
			System.out.println("Inserted Successfully");
		}
		else {
		System.out.println("Inserted Failed");
		}
	}
}
