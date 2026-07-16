package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(path = "/home", method=RequestMethod.GET)
    public String home(Model model) {
    	System.out.println("This is home");
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
    public String about(Model model) {
    	System.out.println("About Programmer");
    	model.addAttribute("name" ,"HR Ansari");
    	return "about";
    }
   @RequestMapping("/help")
    public ModelAndView help() {
    	 System.out.println("Help Page");
    	 ModelAndView modeAndView=new ModelAndView();
    	 modeAndView.addObject("name","Hashim Ansari");
    	 modeAndView.addObject("helpId",542323);
    	 LocalDateTime now = LocalDateTime.now();
    	 modeAndView.addObject("date",now);
    	 modeAndView.addObject("need","Please help me");
    	 
    	 List<Integer> marks=new ArrayList<Integer>();
    	 marks.add(87);
    	 marks.add(89);
    	 marks.add(98);
    	 marks.add(85);
    	 marks.add(78);
    	 modeAndView.addObject("marks",marks);
    	 
    	 modeAndView.setViewName("help");
    	 return modeAndView;
    }
}
