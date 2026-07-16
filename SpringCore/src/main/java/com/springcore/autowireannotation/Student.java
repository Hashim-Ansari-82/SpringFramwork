package com.springcore.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {

	@Autowired
	private Certificate certificate;
}
