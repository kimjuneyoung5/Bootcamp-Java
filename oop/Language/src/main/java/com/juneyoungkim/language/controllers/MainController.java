package com.juneyoungkim.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.juneyoungkim.language.models.Language;
import com.juneyoungkim.language.services.LanguageService;

@Controller
public class MainController {
	
	@Autowired
	private LanguageService langServ;
	
	//----------------------Create-------------------------//
	@GetMapping("/languages")
	public String index(@ModelAttribute("langObj") Language emptyLang, Model model) {
		List<Language> allLanguages = langServ.allLanguages();
		model.addAttribute("languages", allLanguages);
		
		return "index.jsp";
	}
	
	@PostMapping("/languages/create")
	public String create(@Valid @ModelAttribute("langObj") Language filledLanguage, BindingResult results, Model model) {
		if(results.hasErrors()) {
			List<Language> allLanguages = langServ.allLanguages();
			model.addAttribute("languages", allLanguages);
			
			return "index.jsp";
		}
		else {
			langServ.saveLanguage(filledLanguage);
			
			return "redirect:/languages";
		}
	}
	
	//----------------------UPDATE-------------------------//
	@GetMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long language_id, Model model) {
		Language oneLang = langServ.findOneLanguage(language_id);
		model.addAttribute("langObj", oneLang);
		
		return "edit.jsp";
	}
	
	@PutMapping("/languages/edit/{id}")
	public String update(@Valid @ModelAttribute("langObj") Language filledLanguage, BindingResult results) {
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		else {
			langServ.saveLanguage(filledLanguage);
			
			return "redirect:/languages";
		}
	}
	
	//----------------------Read One-------------------------//
	@GetMapping("/languages/{id}")
	public String oneLanguage(@PathVariable("id") Long language_id, Model model) {
		Language oneLang = langServ.findOneLanguage(language_id);
		model.addAttribute("language", oneLang);
		
		return "display.jsp";
	}
	
	//----------------------Delete-------------------------//
	@GetMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long language_id) {
		langServ.deleteLanguage(language_id);
		
		return "redirect:/languages";
	}
}
