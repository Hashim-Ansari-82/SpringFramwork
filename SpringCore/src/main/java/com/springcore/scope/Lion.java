package com.springcore.scope;

public class Lion {
   private String color;
   private String scope;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "Lion [color=" + color + ", scope=" + scope + "]";
	}
}
