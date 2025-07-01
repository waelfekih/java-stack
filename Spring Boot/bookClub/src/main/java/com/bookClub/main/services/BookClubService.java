package com.bookClub.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookClub.main.models.BookClub;
import com.bookClub.main.repositories.BookClubRepository;

import jakarta.validation.Valid;

@Service
public class BookClubService {

    @Autowired
    private BookClubRepository repo;

    // List all books
    public List<BookClub> all() {
        return repo.findAll();
    }

    // Create a new book
    public BookClub create(@Valid BookClub book) {
        return repo.save(book);
    }

    // Find book by ID
    public BookClub findById(Long id) {
        Optional<BookClub> optionalBook = repo.findById(id);
        return optionalBook.orElse(null);
    }

    // Update an existing book
    public BookClub update(@Valid BookClub book) {
        return repo.save(book);
    }

    // Delete a book by ID
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
