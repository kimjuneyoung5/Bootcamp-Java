package com.juneyoungkim.book.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;

import com.juneyoungkim.book.models.Book;
import com.juneyoungkim.book.services.MainService;

@Controller
public class BookController {
	private final MainService mainServ;
	
	public BookController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> allBooks = mainServ.allBooks();
		model.addAttribute("books", allBooks);
		
		return "index.jsp";
	}
}
