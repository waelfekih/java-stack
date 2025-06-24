package com.allBooks.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.allBooks.main.models.Book;
import com.allBooks.main.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> AllBooks(){
		return bookRepository.findAll();
	}
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
	}
	
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}
	}
}