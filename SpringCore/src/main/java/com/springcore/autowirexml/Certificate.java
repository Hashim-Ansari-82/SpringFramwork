package com.springcore.autowirexml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Certificate {

	private int certiNo;
	private String name;
	private String course;
	private String cost;
}
