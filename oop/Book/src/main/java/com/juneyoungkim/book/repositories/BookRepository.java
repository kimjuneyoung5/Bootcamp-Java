package com.juneyoungkim.book.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juneyoungkim.book.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	// CREATE CUSTOM QUERIES
	List<Book> findAll();
}