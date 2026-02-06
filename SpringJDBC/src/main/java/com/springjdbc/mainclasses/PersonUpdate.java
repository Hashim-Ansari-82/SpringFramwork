package com.springjdbc.mainclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.PersonDao;
import com.springjdbc.entites.Person;

public class PersonUpdate {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springjdbc/spjdbc.config.xml");
		PersonDao personDao = con.getBean("personDao",PersonDao.class);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Person You Can Change");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter Person new Name");
		String name = br.readLine();
		System.out.println("Enter Person New Age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter Person new Address");
		String address = br.readLine();
		System.out.println("Enter Person new Country");
		String country = br.readLine();
		Person person = new Person();
		person.setPerId(id);
		person.setPerName(name);
		person.setAge(age);
		person.setAddress(address);
		person.setCountry(country);
		int update = personDao.update(person);
		if(update>0) {
			System.out.println("Updated Successfully");
		}
		else {
		System.out.println("Updated Failed");
	}
	}
}
