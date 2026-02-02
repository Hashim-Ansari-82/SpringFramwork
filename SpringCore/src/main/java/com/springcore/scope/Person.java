package com.springcore.scope;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	
   @Value("Maharastra")
   private String Address;
   @Value("Very Innocent")
   private String propertie;
   @Value("#{map}")
   private Map<Integer,String> map;
   
		public String getAddress() { 
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getPropertie() {
			return propertie;
		}
		public void setPropertie(String propertie) {
			this.propertie = propertie;
		}
		public Map<Integer, String> getMap() {
			return map;
		}
		public void setMap(Map<Integer, String> map) {
			this.map = map;
		}
		@Override
		public String toString() {
			return "Person [Address=" + Address + ", propertie=" + propertie + ", map=" + map + "]";
		}
}
