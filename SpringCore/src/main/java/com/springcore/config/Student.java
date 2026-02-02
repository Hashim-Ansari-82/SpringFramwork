package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;

public class Student {
  
		@Value("12")
		private int id;
		@Value("Hashim Ansari")
		private String name;
		@Value("20")
		private int age;
		@Value("Koilsa Uttar pradesh Sant Kabir Nagar")
		private String Address;
		@Value("Uttar Pradesh")
		private String state;
		@Value("272125")
		private int pinCode;
		
		public void detail() {
			System.out.println("ID : "+id+"\nNAME : "+name+"\nAGE : "
		    +age+"\nADDRESS : "+Address+"\nSTATE  : "+state+"\nPINCODE : "+pinCode);
		}	
 }
