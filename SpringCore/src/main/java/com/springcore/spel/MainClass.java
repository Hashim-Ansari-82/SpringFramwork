package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel.config.xml");
	MethematicsExpression m1 = context.getBean("methematicsExpression",MethematicsExpression.class);
	
	System.out.println(m1);
	System.out.println("Addition = "+m1.getAddition());
	System.out.println("Division = "+m1.getDivision());
	System.out.println("Modulous = "+m1.getModulous());
	System.out.println("Multiplication = "+m1.getMultiplication());
	System.out.println("Substraction = "+m1.getSubstraction());
	System.out.println("Squire = "+m1.getSquire());
	System.out.println("SquireRoot = "+m1.getSquireRoot());
	System.out.println("E = "+m1.getE());
	System.out.println("PI = "+m1.getPi());
	System.out.println("Name = "+m1.getName());
	System.out.println("isActive = "+m1.getIsActive());
	} 
}  
