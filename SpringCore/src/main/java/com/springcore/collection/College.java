package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class College {

	private Map<Integer,String> student;
	private Properties teacher;
	private List<String> peon;
	
}
