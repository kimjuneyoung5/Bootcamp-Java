package com.juneyoungkim.dojo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.juneyoungkim.dojo.models.Dojo;
import com.juneyoungkim.dojo.models.Ninja;
import com.juneyoungkim.dojo.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("dojoObj") Dojo emptyDojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String create(
			@ModelAttribute("dojoObj") Dojo filledDojo
		) {
		mainServ.saveDojo(filledDojo);
		return "redirect:/ninjas/new";
	}
	
	@GetMapping("/ninjas/new")
	public String ninjas(
			@ModelAttribute("ninjaObj") Ninja emptyNinja,
			Model model
		) {
		List<Dojo> allDojos = mainServ.allDojos();
		model.addAttribute("dojos", allDojos);
		
		return "newninja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinjas(
			@ModelAttribute("ninjaObj") Ninja filledNinja
		) {
		mainServ.saveNinja(filledNinja);
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos")
	public String display(
			Model model
		) {
		List<Dojo> allDojos = mainServ.allDojos();
		model.addAttribute("dojos", allDojos);
		return "index.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String displayNinjas(
			@PathVariable("id") Long dojo_id, Model model
		) {
		//List<Ninja> allNinja = mainServ.findDojo(dojo_id).getNinjas();
		model.addAttribute("dojo", mainServ.findDojo(dojo_id));
		//model.addAttribute("ninjas", allNinja);
		
		return "display.jsp";
	}
}
