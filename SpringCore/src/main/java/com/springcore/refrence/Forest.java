package com.springcore.refrence;

public class Forest {

	private String pond;
	private String name;
	private Lion lion;
	public String getPond() {
		return pond;
	}
	public void setPond(String pond) {
		this.pond = pond;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Lion getLion() {
		return lion;
	}
	public void setLion(Lion lion) {
		this.lion = lion;
	}
	public Forest(String pond, String name, Lion lion) {
		super();
		this.pond = pond;
		this.name = name;
		this.lion = lion;
	}
	public Forest() {
		super();
	}
	@Override
	public String toString() {
		return "Forest [pond=" + pond + ", name=" + name + ", lion=" + lion + "]";
	}
	
}
