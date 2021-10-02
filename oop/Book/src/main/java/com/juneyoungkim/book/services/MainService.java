package com.juneyoungkim.book.services;

import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

import com.juneyoungkim.book.models.Book;
import com.juneyoungkim.book.repositories.BookRepository;

@Service
public class MainService {
	private final BookRepository bookRepository;
    
    public MainService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
    	return bookRepository.findById(id).orElse(null);
//        Optional<Book> optionalBook = bookRepository.findById(id);
//        if(optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
    }
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	// TODO Auto-generated method stub
    	 Book b = this.findBook(id);
    	 b.setTitle(title);
    	 b.setDescription(desc);
    	 b.setLanguage(lang);
    	 b.setNumberOfPages(numOfPages);
    	 return bookRepository.save(b);
    	}
     public void deleteBook(Long id) {
    	// TODO Auto-generated method stub
    	bookRepository.deleteById(id);
     }
}