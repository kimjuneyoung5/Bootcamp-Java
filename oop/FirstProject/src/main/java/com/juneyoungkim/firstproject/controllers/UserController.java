package com.juneyoungkim.firstproject.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.juneyoungkim.firstproject.models.User;
import com.juneyoungkim.firstproject.services.UserService;
import com.juneyoungkim.firstproject.validators.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@Autowired
	private UserValidator userVali;
	
	@GetMapping("/register")
	public String registerForm(@ModelAttribute("userObj") User emptyUser) {
		return "register.jsp";
	}
	
	@PostMapping("/register")
	public String registerUser(
			@Valid @ModelAttribute("userObj") User filledUser, BindingResult result, HttpSession session
		) {
		userVali.validate(filledUser, result);
		if(result.hasErrors()) {
			return "RegistrationPage.jsp";
		}
		else {
			User newUser = userServ.registerUser(filledUser);
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/dashboard";
		}
	}
	
	
	@PostMapping("/login")
	public String loginUser(
			@RequestParam("email") String email, @RequestParam("password") String password, 
			Model model, HttpSession session, RedirectAttributes flashMessages
		) {
		if(userServ.authenticateUser(email, password)) {
			User loggedUser = userServ.findByEmail(email);
			session.setAttribute("user_id", loggedUser.getId());
			return "redirect:/dashboard";
		}
		else {
			flashMessages.addFlashAttribute("error", "invalid login");
			return "redirect:/login";
		}
	}
	
	@RequestMapping("/dashboard")
	public String home(HttpSession session, Model model) {
		Long userId = (Long)session.getAttribute("user_id");
		User loggedUser = userServ.findById(userId);
		model.addAttribute("user", loggedUser);
		return "Dashboard.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
}
