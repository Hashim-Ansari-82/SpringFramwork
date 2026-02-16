package com.springorm.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StudentDaoImpl implements StudentDao{

		private HibernateTemplate template;
		@Override
		public int insert(Student student) {
			Integer i = (Integer)this.template.save(student);
			return i;
		}
		@Override
		public List<Student> fetch() {
			List<Student> student = this.template.loadAll(Student.class);
			student.forEach(list ->{
				System.out.println(list);
			});
			return student;
		}
		@Override
		public void delete(int studentId) {
	      Student student = this.template.get(Student.class,studentId);
	      this.template.delete(student);
		}
		@Override
		public void update(Student studentId) {
	      this.template.update(studentId);
		}
		@Override
		public Student fetch(int studentId) {
			Student student = this.template.get(Student.class,studentId);
			return student;
		}
		public HibernateTemplate getTemplate() {
			return template;
		}
		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}
}
