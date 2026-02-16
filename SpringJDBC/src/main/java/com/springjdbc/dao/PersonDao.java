package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entites.Person;

public interface PersonDao {
       
	public int insert(Person person);
	public int update(Person person);
	public List<Person> fetch();
}
