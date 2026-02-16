package com.springorm.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.dao.EmployeeDao;
import com.springorm.entities.Employee;

@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	private HibernateTemplate template;
	@Override
	public int insert(Employee emp) {
		Integer save = (Integer)this.template.save(emp);
		return save;
	}

	@Override
	public Employee fetchOne(int empid) {
       Employee employee = this.template.get(Employee.class,empid);	
       return employee;
	}

	@Override
	public List<Employee> fetchAll() {
		List<Employee> emp = this.template.loadAll(Employee.class);
		return emp;
	}

	@Override
	public void delete(int emp) {
		Employee employee = this.template.get(Employee.class, emp);
		this.template.delete(employee);
	}
	@Override
	public void update(Employee empId) {
    this.template.update(empId);		
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
