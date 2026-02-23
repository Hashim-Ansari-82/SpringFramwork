package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
    public void commonModel(Model model) {
    	model.addAttribute("Header", "Admission Form");
		model.addAttribute("desc", "Only For Student");
		System.out.println("Common Method");
    }	
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Contact Method");
		  return "contact";
	}
	@RequestMapping(path ="/processform",method=RequestMethod.POST)
	public String handleForm( @ModelAttribute User user) {
		System.out.println(user);
		return "success";	
	}
}
/*
 * @RequestMapping(path ="/processform",method=RequestMethod.POST)
 *  public String handleForm(
 * @RequestParam("email") String email,
 * @RequestParam("userName") String userName,
 * @RequestParam("password") String password,
 * @RequestParam("number") String number, Model model) {
 * 
 * User user = new User();
 *  user.setEmail(email);
 *   user.setUserName(userName);
 * user.setPassword(password); 
 * user.setNumber(number);
 * 
 * System.out.println(user);
 * 
 * System.out.println("User Email "+email);
 * System.out.println("User Name "+userName);
 * System.out.println("User Password "+password);
 * System.out.println("User Number "+number);
 * model.addAttribute("userName",userName); 
 * model.addAttribute("email",email);
 * model.addAttribute("password",password); 
 * model.addAttribute("number",number);
 * model.addAttribute("user" , user);
 *  return "success"; } }
 */