package com.springjdbc.entites;

public class Friends {

			private String name;
			private int age;
			private String address;
			private String state;
			@Override
			public String toString() {
				return "Friends [name=" + name + ", age=" + age + ", address=" + address + ", state=" + state + "]";
			}
			public Friends() {
				super();
			}
			public Friends(String name, int age, String address, String state) {
				super();
				this.name = name;
				this.age = age;
				this.address = address;
				this.state = state;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
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
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
	
}
