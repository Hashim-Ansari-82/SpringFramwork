package com.springjdbc.mainclasses;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.PersonDao;
import com.springjdbc.entites.Person;

public class PersonFetch {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/spjdbc.config.xml");
		  PersonDao bean = context.getBean("personDao",PersonDao.class);
		  List<Person> fetch = bean.fetch();
		  fetch.forEach(list ->{
			  System.out.println(list);
		  });
  }
}
