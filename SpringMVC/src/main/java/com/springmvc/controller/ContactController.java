package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		  return "contact";
	}
	@RequestMapping(path ="/processform",method=RequestMethod.POST)
	public String handleForm( @ModelAttribute User user,Model model) {
		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		int userCreated = this.userService.createUser(user);
		model.addAttribute("msg","User Created Successfully "+userCreated);
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