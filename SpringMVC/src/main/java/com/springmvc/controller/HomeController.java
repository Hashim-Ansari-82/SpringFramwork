package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
    	System.out.println("this is home");
    	model.addAttribute("name","Hashim Ansari");
    	model.addAttribute("id",12);
    	List<String> friends=new ArrayList<String>();
    	friends.add("Hashim Ansari");
    	friends.add("Uzma Ansari");
    	friends.add("Qaab Ansari");
    	friends.add("Musab Ansari");
    	friends.add("Tahir Ansari");
    	friends.add("Qasim Ansari");
    	model.addAttribute("list",friends);
        return "index";
    }
    @RequestMapping("/about")
    public String about(ModelAndView view) {
    	System.out.println("about programmer");
    	view.addObject("name" ,"Hashim Ansari");
    	return "about";
    }
}
