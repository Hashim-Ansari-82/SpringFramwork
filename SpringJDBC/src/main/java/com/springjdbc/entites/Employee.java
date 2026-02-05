package com.springjdbc.entites;

public class Employee {
														@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", hireDate=" + hireDate + ", salary=" + salary
				+ ", empAge=" + empAge + ", city=" + city + ", gender=" + gender + ", contact=" + contact
				+ ", empAddress=" + empAddress + ", empEmail=" + empEmail + ", empState=" + empState + "]";
	}
			/* Insert Operation*/
			private int empid;
			private String empName;
			private String hireDate;
			private int salary;
			private int empAge;
			private  String city;
			private String gender;
			private String contact;
			private String empAddress;
			private String empEmail;
			private String empState;
			public int getEmpid() {
				return empid;
			}
			public void setEmpid(int empid) {
				this.empid = empid;
			}
			public String getEmpName() {
				return empName;
			}
			public void setEmpName(String empName) {
				this.empName = empName;
			}
			public String getHireDate() {
				return hireDate;
			}
			public void setHireDate(String hireDate) {
				this.hireDate = hireDate;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			public int getEmpAge() {
				return empAge;
			}
			public void setEmpAge(int empAge) {
				this.empAge = empAge;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getContact() {
				return contact;
			}
			public void setContact(String contact) {
				this.contact = contact;
			}
			public String getEmpAddress() {
				return empAddress;
			}
			public void setEmpAddress(String empAddress) {
				this.empAddress = empAddress;
			}
			public String getEmpEmail() {
				return empEmail;
			}
			public void setEmpEmail(String empEmail) {
				this.empEmail = empEmail;
			}
			public String getEmpState() {
				return empState;
			}
			public void setEmpState(String empState) {
				this.empState = empState;
			}
		public Employee(int empid, String empName, String hireDate, int salary, int empAge, String city, String gender,
				String contact, String empAddress, String empEmail, String empState) {
					super();
					this.empid = empid;
					this.empName = empName;
					this.hireDate = hireDate;
					this.salary = salary;
					this.empAge = empAge;
					this.city = city;
					this.gender = gender;
					this.contact = contact;
					this.empAddress = empAddress;
					this.empEmail = empEmail;
					this.empState = empState;
		}
		public Employee() {
			super();
		}
}