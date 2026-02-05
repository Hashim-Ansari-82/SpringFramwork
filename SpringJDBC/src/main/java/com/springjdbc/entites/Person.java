package com.springjdbc.entites;

public class Person {

	 private int perId;
	 private String perName;
	 private int age;
	 private String address;
	 private String country;
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", age=" + age + ", address=" + address
				+ ", country=" + country + "]";
	}
	public Person() {
		super();
	}
	public Person(int perId, String perName, int age, String address, String country) {
		super();
		this.perId = perId;
		this.perName = perName;
		this.age = age;
		this.address = address;
		this.country = country;
	}
}
