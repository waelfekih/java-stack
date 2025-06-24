package com.allBooks.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.allBooks.main.models.Book;
import com.allBooks.main.services.BookService;

import org.springframework.ui.Model;

@Controller
public class BooksController {
 private final BookService bookService;
 
 public BooksController(BookService bookService) {
     this.bookService = bookService;
 }
 
 @RequestMapping("/books")
 public String index(Model model) {
     List<Book> books = bookService.AllBooks();
     model.addAttribute("books", books);
     return "/books/index";
 }
 
 @GetMapping("/books/{bookId}")
 public String oneBook (Model model, @PathVariable("bookId") Long bookId) {
	 Book book = bookService.findBook(bookId);
     model.addAttribute("book", bookService.findBook(bookId));

	 return "/books/oneBook" ;
 }
}
