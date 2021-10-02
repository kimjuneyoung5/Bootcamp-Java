package com.juneyoungkim.dojosurvey.controllers;

//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(
				@RequestParam(value="firstName") String firstName,
				@RequestParam(value="dojoLocation") String dojoLocation,
				@RequestParam(value="favLanguage") String favLanguage,
				@RequestParam(value="comment") String comment,
				Model model
			) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("dojoLocation", dojoLocation);
		model.addAttribute("favLanguage", favLanguage);
		model.addAttribute("comment", comment);
		
		return "result.jsp";
	}
	
	//@GetMapping("/result")
	//public String result() {
	//	return "result.jsp";
	//}
	
}
