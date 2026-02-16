package com.springjdbc.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.PersonDao;
import com.springjdbc.entites.Person;

public class PersonDaoImp implements PersonDao{

	private JdbcTemplate template;
		@Override
		public int insert(Person person) {
			  String query="insert into Person values(?,?,?,?,?)";
			  int insert = template.update(query,person.getPerId(),person.getPerName(),person.getAge(),person.getAddress(),person.getCountry());
			  return insert;
		}
		public int update(Person person) {
			String query="update Person set perName=?, Age=?,Address=?,Country=?  where PerId=?";
			int update = this.template.update(query,person.getPerName(),person.getAge(),person.getAddress(),person.getCountry(),person.getPerId());
		return update;
		}
		@Override
		public List<Person> fetch() {
			String query="Select * from person";
			List<Person> list = template.query(query,new RowMapperImp2());
			return list;
		}
		public JdbcTemplate getTemplate() {
			return template;
		}
		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
       
}
