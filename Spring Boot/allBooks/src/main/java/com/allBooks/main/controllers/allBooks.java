package com.allBooks.main.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.allBooks.main.models.Book;
import com.allBooks.main.services.BookService;

@RestController
public class allBooks {
	private final BookService bookService;
	
	public allBooks(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/allbooks")
	public List<Book> index() {
		return bookService.AllBooks();
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(
			@RequestParam(value="title") String title, 
			@RequestParam(value="description") String desc, 
			@RequestParam(value="language") String lang, 
			@RequestParam(value="pages") Integer numOfPages){
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        book.setId(id);
        return bookService.updateBook(book);
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}