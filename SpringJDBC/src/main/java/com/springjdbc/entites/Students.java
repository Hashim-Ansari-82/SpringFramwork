package com.springjdbc.entites;

public class Students {

			private int id;
			private String studentName;
			private int age;
			private String city;
			private String address;
			
		public Students(int id, String studentName, int age, String city, String address) {
					super();
					this.id = id;
					this.studentName = studentName;
					this.age = age;
					this.city = city; 
					this.address = address;
		}
		public Students() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
