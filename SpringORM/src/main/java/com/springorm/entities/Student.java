package com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Student_Detail")
public class Student {

				@Id
				@Column(name="Student_Rollno")
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private int rollno;
				@Column(name = "Student_Name")
				private String name;
				@Column(name ="Student_Address")
				private String address;
				@Column(name = "Student_Gender")
				private char gender;
				public int getRollno() {
					return rollno;
				}
				public void setRollno(int rollno) {
					this.rollno = rollno;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getAddress() {
					return address;
				}
				public void setAddress(String address) {
					this.address = address;
				}
				public char getGender() {
					return gender;
				}
				public void setGender(char gender) {
					this.gender = gender;
				}
				public Student(String name, String address, char gender) {
					super();
					this.name = name;
					this.address = address;
					this.gender = gender;
				}
				@Override
				public String toString() {
					return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
				}
				public Student() {
					super();
					// TODO Auto-generated constructor stub
				}
	
}
