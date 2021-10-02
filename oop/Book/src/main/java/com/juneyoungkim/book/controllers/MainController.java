package com.juneyoungkim.book.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juneyoungkim.book.models.Book;
import com.juneyoungkim.book.services.MainService;

@RestController
public class MainController {
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	
	@GetMapping("/api/books")
	public List<Book> allBooks() {
		return mainServ.allBooks();
	}
	
	@GetMapping("/api/books/{id}")
	public Book oneBook(
			@PathVariable("id") Long book_id
	) {
		return mainServ.findBook(book_id);
	}
	
	@PostMapping("/api/books/new")
	public Book createBook(
			@RequestParam("title") String title,
			@RequestParam("description") String desc,
			@RequestParam("language") String lang,
			@RequestParam("numPages") Integer numPages
	) {
		Book newBook = new Book(title, desc, lang, numPages);
		return mainServ.createBook(newBook);
	}
	
	@PutMapping("/api/books/{id}")
	public Book updateBook(
			@PathVariable("id") Long id,
			@PathVariable("title") String title,
			@PathVariable("description") String desc,
			@PathVariable("language") String lang,
			@PathVariable("numPages") Integer numPages
		) {
		return mainServ.updateBook(id, title, desc, lang, numPages);
	}
	
	@DeleteMapping("/api/books/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		mainServ.deleteBook(id);
	}
	
}
