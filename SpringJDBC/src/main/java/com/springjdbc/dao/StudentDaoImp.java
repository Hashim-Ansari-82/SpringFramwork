package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.entites.Students;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate template;
		@Override
		public int insert(Students student){

			  String query="insert into student(id,studentName, age,city,address) values(?,?,?,?,?)";
			  
	  int insert = template.update(query,student.getId(),student.getStudentName(),student.getAge(),student.getCity(),student.getAddress());
			    return insert;
		}
		public JdbcTemplate getTemplate() {
			return template;
		}
		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}

}
