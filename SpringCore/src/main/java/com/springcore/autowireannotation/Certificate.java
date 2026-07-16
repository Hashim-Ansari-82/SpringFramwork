package com.springcore.autowireannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Certificate {

	@Value("54324")
	private int cerNo;
	@Value("Java Certificate")
	private String name;
	@Value("Full Stack Java Developer")
	private String course;
	@Value("20000")
	private String cost;
}
