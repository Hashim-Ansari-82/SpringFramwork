package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MethematicsExpression {
    
	@Value("#{54+12}")
	private int addition;
	@Value("#{54-12}")
	private int substraction;
	@Value("#{5*13}")
	private double multiplication;
	@Value("#{54.5/17}")
	private double division;
	@Value("#{55.9%17}")
	private double Modulous;
	@Value("#{T(java.lang.Math).pow(25,2)}")
	private double squire;
	@Value("#{T(java.lang.Math).sqrt(625)}")
	private double squireRoot;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	@Value("#{new java.lang.String('Hashim Ansari')}")
	private String name;
	@Value("#{6<7}")
	private boolean isActive;
	
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSquire() {
		return squire;
	}
	public void setSquire(double squire) {
		this.squire = squire;
	}
	public int getAddition() {
		return addition;
	}
	public void setAddition(int addition) {
		this.addition = addition;
	}
	public int getSubstraction() {
		return substraction;
	}
	public void setSubstraction(int substraction) {
		this.substraction = substraction;
	}
	public double getMultiplication() {
		return multiplication;
	}
	public void setMultiplication(double multiplication) {
		this.multiplication = multiplication;
	}
	public double getDivision() {
		return division;
	}
	public void setDivision(double division) {
		this.division = division;
	}
	public double getModulous() {
		return Modulous;
	}
	public void setModulous(double modulous) {
		Modulous = modulous;
	}
	public double getSquireRoot() {
		return squireRoot;
	}
	public void setSquireRoot(double squireRoot) {
		this.squireRoot = squireRoot;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	@Override
	public String toString() {
		return "MethematicsExpression [addition=" + addition + ", substraction=" + substraction + ", multiplication="
				+ multiplication + ", division=" + division + ", Modulous=" + Modulous + ", squire=" + squire
				+ ", squireRoot=" + squireRoot + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
}
