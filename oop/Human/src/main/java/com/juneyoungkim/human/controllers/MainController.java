package com.juneyoungkim.human.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/your_server")
	public String index() {
		return "index.jsp";	
	}
	
	@RequestMapping("/your_server/{user_name}")
	public String viewUser(Model model, @PathVariable("user_name") String username) {
		model.addAttribute("user_name", username);
		
		return "display.jsp";
	}
}
