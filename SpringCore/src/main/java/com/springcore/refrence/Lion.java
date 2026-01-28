package com.springcore.refrence;

public class Lion {

	private String name;
	private String propertie;
	public String getName() {
		return name;
	}
	public Lion(String name, String propertie) {
		super();
		this.name = name;
		this.propertie = propertie;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPropertie() {
		return propertie;
	}
	public void setPropertie(String propertie) {
		this.propertie = propertie;
	}
	public Lion() {
		super();
	}
	@Override
	public String toString() {
		return "Lion [name=" + name + ", propertie=" + propertie + "]";
	}
}
