package com.booksAPI.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.booksAPI.main.models.Book;
import com.booksAPI.main.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/books";
		//return "index";
	}
	
	@GetMapping("/books")
	public String showAllBooks(Model model) {
		List<Book> books = bookService.allBooks();
	    model.addAttribute("books", books);
	    System.out.print("All books" + books );
	    return "index"; 
	}
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId) {
		
        model.addAttribute("book", bookService.findBook(bookId));
        return "show";
	}

}