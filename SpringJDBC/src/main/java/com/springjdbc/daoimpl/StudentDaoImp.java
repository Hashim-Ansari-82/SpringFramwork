package com.springjdbc.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entites.Students;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate template;
	
		@Override
		public List<Students> f2() {
			String query="Select * from Student";
			List<Students> list = template.query(query,new RowMapperImp());
			return list;
		}
		@Override
		public Students f1(int studentId) {
  
			String query="Select * from Student where Id=?";
			RowMapper<Students>  rowMapper = new RowMapperImp();
			Students student = template.queryForObject(query, rowMapper,studentId);
			return student;
			
		}
		@Override
		public int insert(Students student){
	
			  String query="insert into student"
			  		+ "(id,studentName, age,city,address) "
			  		+ "values(?,?,?,?,?)";
			  
	  int insert = template.update(query,student.getId(),student.getStudentName(),student.getAge(),student.getCity(),student.getAddress());
			    return insert;
		}
		@Override
		public int delete(int studentId) {
           String query="Delete From student where id=?";
           int update = template.update(query,studentId);
			return update;
		}
		@Override
		public int u1(Students student) {
			  String query="update student set studentName=?  where Id=?";
	          int update = this.template.update(query,student.getStudentName(),student.getId());
				return update;
		}
		@Override
		public int u2(Students student) {
			 String query="update student set city=?  where Id=?";
	          int update = this.template.update(query,student.getCity(),student.getId());
				return update;
		}
		@Override
		public int u3(Students student) {
			 String query="update student set Age=?  where Id=?";
	          int update = this.template.update(query,student.getAge(),student.getId());
				return update;
		}
		@Override
		public int u4(Students student) {
			 String query="update student set Address=?  where Id=?";
	         int update = this.template.update(query,student.getAddress(),student.getId());
			return update;
		}
		@Override
		public int u5(Students student) {
			 String query="update student set studentName=?,Address=?  where Id=?";
	         int update = this.template.update(query,student.getStudentName(),student.getAddress(),student.getId());
			return update;
		}
		@Override
		public int u6(Students student) {
			String query="update student set city=?,Address=?  where Id=?";
	          int update = this.template.update(query,student.getCity(),student.getAddress(),student.getId());
				return update;
		}
		@Override
		public int u7(Students student) {
			String query="update student set Age=?,Address=?  where Id=?";
	         int update = this.template.update(query,student.getAge(),student.getAddress(),student.getId());
			return update;
		}
		@Override
		public int u8(Students student) {  
			String query="update student set studentName=?,Age=?  where Id=?";
	         int update = this.template.update(query,student.getStudentName(),student.getAge(),student.getId());
			return update;
		}
		@Override
		public int u9(Students student) {
			String query="update student set studentName=?, city=?  where Id=?";
	         int update = this.template.update(query,student.getStudentName(),student.getCity(),student.getId());
			return update;
		}
		@Override
		public int u10(Students student) {
			String query="update student set city=?,Age=?  where Id=?";
	         int update = this.template.update(query,student.getCity(),student.getAge(),student.getId());
			return update;
		}
		@Override
		public int u11(Students student) {
			String query="update student set studentName=?, city=?,Age=?  where Id=?";
	         int update = this.template.update(query,student.getStudentName(),student.getCity(),student.getAge(),student.getId());
			return update;
		}
		@Override
		public int u12(Students student) {
			String query="update student set city=?,Age=?,Address=?  where Id=?";
	         int update = this.template.update(query,student.getCity(),student.getAge(),student.getAddress(),student.getId());
			return update;
		}
		@Override
		public int u13(Students student) {
			String query="update student set Age=?,Address=?,studentName=?  where Id=?";
	         int update = this.template.update(query,student.getAge(),student.getAddress(),student.getStudentName(),student.getId());
			return update;
		}
		public int u14(Students student) {
			String query="update student set Address=?,studentName=?,city  where Id=?";
	         int update = this.template.update(query,student.getAddress(),student.getStudentName(),student.getCity(),student.getId());
			return update;
		}
		public int u15(Students student) {
			String query="update student set studentName=?, city=?,Address=?,Age=?  where Id=?";
	         int update = this.template.update(query,student.getStudentName(),student.getCity(),student.getAddress(),student.getAge(),student.getId());
			return update;
		}
		public JdbcTemplate getTemplate() {
			return template;
		}
		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
		
}
