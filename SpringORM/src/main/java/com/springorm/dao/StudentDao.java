package com.springorm.dao;

import java.util.List;

import com.springorm.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	public List<Student> fetch();
	public void delete(int studentId);
	public void update(Student studentId);
	public Student fetch(int studentId);
}	

