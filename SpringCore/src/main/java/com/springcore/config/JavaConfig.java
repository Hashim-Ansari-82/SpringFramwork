package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan(basePackages  = {"com.springcore.config"})
public class JavaConfig {
	

	@Bean("rabbit")
	public RabbitEntity getRabbit() {
		
		RabbitEntity rabbit = new RabbitEntity();
		rabbit.getAge();
		rabbit.getColor();
		rabbit.getFood();
		return rabbit;
	}
}
