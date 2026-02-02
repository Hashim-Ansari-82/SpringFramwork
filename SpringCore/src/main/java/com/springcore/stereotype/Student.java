package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
public class Student {
 
	@Value("Hashim Ansari")
	private String name; 
	@Value("Mumbai Sakinaka")
	private String address;
	@Value("#{list}")
	private List<Integer> age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
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
	public List<Integer> getAge() {
		return age;
	}
	public void setAge(List<Integer> age) {
		this.age = age;
	}
	
}
