package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/first")                
	public RedirectView first() {
		System.out.println("this is first Controller");
		RedirectView view = new RedirectView();
		view.setUrl("second");
		return view;
	}
	@RequestMapping("/second")
	public String second() {
		System.out.println("this is second Controller");
		return "contact";
	}
}
