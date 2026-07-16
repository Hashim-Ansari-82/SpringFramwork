package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RabbitEntity {

	@Value("White")
	private String color;
	@Value("4")
	private int age;
	@Value("Carrot")
	private String food;
}
